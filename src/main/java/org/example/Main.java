package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock < 0 || clock > 23)
        {
            return false;
        }

        if(clock > 20 && isBarking )
        {
            return true;
        }
        else if (clock < 8 && isBarking)
        {
            return true;
        }
        else return clock < 20 && clock > 8 && !isBarking;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (13 <= firstAge && firstAge <= 19)
        {
            return true;
        }
        else if (13 <= secondAge && secondAge <= 19)
        {
            return true;
        }
        else return (13 <= thirdAge && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer && temp >= 25 && 45 >= temp)
        {
            return true;
        }
        else return (!isSummer && temp >= 25 && temp <= 35);
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0)
       {
           return -1;
       }
       return width * height;
    }

    public static double area(double radius) {
       if (radius < 0) return -1;
       return radius * radius * Math.PI;
    }
}
