package com.ccsi;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(convertToTitle(53));
    }
    //Given a positive integer,return its corresponding column title as appear in an Excel sheet.
    public static String convertToTitle(int n){
        StringBuilder builder=new StringBuilder();
        while(n!=0){
            int temp=n%26==0?'Z':(n%26+'A'-1);    //26是余数为0，除以26后为1，因而需要判断
            char tempC=(char)temp;
            builder.append(tempC);
            if(n%26==0)n-=26;
            n/=26;
        }

        return builder.reverse().toString();
    }
}
