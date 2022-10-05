package com.bridgelabz;

public class DuplicateElement {
    public static void main(String[] args) {
        int visited=-1;
        int[] arr = new int[]{1, 2, 3, 4, 5, 1, 1, 2, 2, 3};
        int[] result=new int[arr.length];

        for (int i = 0;i<arr.length;i++ ){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[i]);
            }
        }
    }
}