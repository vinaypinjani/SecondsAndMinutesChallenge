package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
        // write your code here
         System.out.println(getDurationString(61, 40));
         System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMins = minutes % 60;
            return hours + "h " + remainingMins + "m " + seconds + "s";
        }
        return "Invalid Value";
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSecs = seconds % 60;
            return getDurationString(minutes, remainingSecs);
        }
        return "Invalid Value";
    }


}
