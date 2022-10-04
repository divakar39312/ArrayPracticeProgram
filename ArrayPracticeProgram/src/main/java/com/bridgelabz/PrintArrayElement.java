package com.bridgelabz;

import java.util.Scanner;

public class PrintArrayElement {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.println(arr[i]+"");
//        }
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
        System.out.println(" "+arr[i]);
    }
    }
}
