package com.bridgelabz;

public class SecondLargest {
    static int secondLargest(int[] arr){
        int firstNumber=0;
        int secondNumber=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >firstNumber){
                secondNumber=firstNumber;
                firstNumber=arr[i];
            }
            else if(arr[i]>secondNumber && arr[i]!=firstNumber){
                secondNumber=arr[i];
            }
        }
        return secondNumber;
    }
    public static void main(String[] args) {
     int[] arr={2,3,4,5,6,7};
     int secondNumber=secondLargest(arr);
     if(secondNumber==0){
         System.out.println("No second largest number");
     }
     else{
         System.out.println(secondNumber);
     }

    }
}
