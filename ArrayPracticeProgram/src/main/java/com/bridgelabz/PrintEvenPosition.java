package com.bridgelabz;

public class PrintEvenPosition {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
//        for(int i=1;i<arr.length;i=i+2){
//            System.out.println(arr[i]);
//        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0)
                System.out.println(arr[i]);
        }
    }
}
