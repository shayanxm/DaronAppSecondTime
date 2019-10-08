package com.example.daronapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daronapp.R;
import com.example.daronapp.model.Data;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Data> dataList;
    private Context context;


    public CustomAdapter(Context context, List<Data> dataList) {
        this.context = context;
        this.dataList = dataList;
    }public void updateData(List<Data> updatedList) {
dataList=updatedList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        TextView statusTv;
        TextView nameTv;
        TextView priceTV;
        ImageView statusIv;
        TextView colorTv;
        private TextView typeTv;
        ImageView imageIv;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            statusIv = mView.findViewById(R.id.item_status_iv);
            nameTv = mView.findViewById(R.id.item_name_tv);
            statusTv = mView.findViewById(R.id.item_status_tv);

            priceTV = mView.findViewById(R.id.item_price_tv);
            colorTv = mView.findViewById(R.id.item_des_tv);
            imageIv = mView.findViewById(R.id.item_main_iv);
            typeTv = mView.findViewById(R.id.item_more_des_tv);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rec_item_view, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Data currentData = dataList.get(position);
        holder.nameTv.setText(currentData.getName());
        holder.statusTv.setText(currentData.getStatus().getMessage());

//        Util util= new Util();
//       util.setStr(moneyImproveViewrt(currentData.getPrice()));
        holder.priceTV.setText(moneyImproveViewrt(currentData.getPrice()));
        stausColorerSeter(holder, currentData);

        showConcatedColors(holder, position, currentData);
        showConcatedTypes(holder, position, currentData);

        imageLoader(holder, currentData);


    }

    //methods
    @Override
    public int getItemCount() {
        return dataList.size();
    }

    private void stausColorerSeter(CustomViewHolder holder, Data currentData) {
        int value = currentData.getStatus().getValue();


        if (value==0){  holder.statusIv.setBackgroundResource(R.drawable.red_circle);}
        if (value==1){  holder.statusIv.setBackgroundResource(R.drawable.green_circle);}
        if (value==3){  holder.statusIv.setBackgroundResource(R.drawable.yelloow_circle);}
    }

    private void showConcatedColors(CustomViewHolder holder, int position, Data currentData) {
        String finalStringBuilder = "";

        for (int i = 0; i < currentData.getSpecifications().size(); i++) {
            if (dataList.get(position).getSpecifications().get(i).getPivotKindCode() == 1) {
                finalStringBuilder += dataList.get(position).getSpecifications().get(i).getPivot().getColor() + " ,";
            }}
           finalStringBuilder = removeEcteralChar(finalStringBuilder);
            holder.colorTv.setText(finalStringBuilder);

    }

    private void showConcatedTypes(CustomViewHolder holder, int position, Data currentData) {
        String finalStringBuilder = "";

        for (int i = 0; i < currentData.getSpecifications().size(); i++) {
            if (dataList.get(position).getSpecifications().get(i).getPivotKindCode() == 2) {
                finalStringBuilder += dataList.get(position).getSpecifications().get(i).getPivot().getColor() + " ,";

            }
        }
       finalStringBuilder = removeEcteralChar(finalStringBuilder);

        holder.typeTv.setText(finalStringBuilder);
        }

    private String removeEcteralChar(String finalStringBuilder) {
        if (finalStringBuilder.length() > 0) {
            if (finalStringBuilder.charAt(finalStringBuilder.length() - 1) == ',')
                finalStringBuilder = finalStringBuilder.substring(0, finalStringBuilder.length() - 1);
        }if (finalStringBuilder.length()<1)
            return "نامشخص";
        return finalStringBuilder;
    }


    private void imageLoader(CustomViewHolder holder, Data currentData) {
        String link = "http://panel.daroonapp.com/storage/" + currentData.getDataImage();

        Picasso.get().load(link).into(holder.imageIv);
    }



    public String moneyImproveViewrt(String base) {
        String leftSide = base.substring(0, base.length() - 3);
        String midSide = ",";
        String rightSide = base.substring(base.length() - 3, base.length());
        return leftSide + midSide + rightSide;

    }

}