package com.ds.handson;

import java.util.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array2D {

    static int hourglassSum(int[][] arr) {
 int max=-99999,sum=0;
 for(int i=0;i<4;i++){
     sum=0;
     for(int j=0;j<4;j++){
         sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                arr[i+1][j+1] + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        if(sum>max){
            max=sum;
        }
     }
     
 }
 return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                
            }
            
        }

        int result = hourglassSum(arr);


        System.out.println("The maximum of hour-glass sum is:" +result);
        scanner.close();
    }
}