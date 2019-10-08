package com.example.daronapp.util;

public class Util {
    String str;

    public String covertToArabic(){
    char[] arabicChars = {'٠','١','٢','٣','٤','٥','٦','٧','٨','٩'};
    StringBuilder builder = new StringBuilder();
for(int i =0;i<str.length();i++)
    {
        if(Character.isDigit(str.charAt(i)))
        {
            builder.append(arabicChars[(int)(str.charAt(i))-48]);
        }
        else
        {
            builder.append(str.charAt(i));
        }
    }

return builder.toString();
}

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
