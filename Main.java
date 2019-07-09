package com.company;

public class Main {
    public static boolean isStartSmaller(int start,int end){
        if(start>end){
            return false;
        }
        else return true;
    }
    public static boolean isInRange(int start,int end){
        if(1<=start&&start<=1000&&1<=end&&end<=1000){
            return true;
        }
        else return false;
    }
    public static String multiplyTable(int a,int b) {
        if (isInRange(a, b) == false) {
            return null;
        }
        if(isStartSmaller(a,b)==false) {
            return null;
        }
            String result = "";
            for (int i = a; i <= b; i++)
                for (int j = a; j <= i; j++) {
                    result = result + j + "*" + i + "=" + (j * i);
                    if (j < i) {
                        result = result + " ";
                    } else result = result + '\n';
                }
            return result;
        }


    public static void main(String[] args) {
        //test
        String result=multiplyTable(2,4);
       System.out.println(result);

        }

    }

