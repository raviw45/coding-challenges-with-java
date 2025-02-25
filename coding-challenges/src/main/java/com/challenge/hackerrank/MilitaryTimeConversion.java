package com.challenge.hackerrank;

public class MilitaryTimeConversion {

    public static void convertToMilitaryTime(String s){
        String hour=s.substring(0,2);
        String minute=s.substring(3,5);
        String seconds=s.substring(6,8);
        String periods=s.substring(8,10);

        int hourInt=Integer.parseInt(hour);

        if(periods.contains("AM")){
            if(hourInt==12){
                hour="00";
            }
        }else if(periods.contains("PM")){
            if(hourInt !=12){
                hourInt+=12;
                hour=Integer.toString(hourInt);
            }
        }

        System.out.println(hour+":"+minute+":"+seconds);

    }
    public static void main(String[] args) {
        String s="07:04:10PM";
       convertToMilitaryTime(s);
    }
}
