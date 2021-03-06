package com.ds.handson;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n,int m,int[][] queries) {
        long[] arr=new long[n+2];
        int a,b,k;
        long max=0;
        
        for(int i=0;i<m;i++)
          {  a=queries[i][0];
            b=queries[i][1];
            k=queries[i][2];
            arr[a]+=k;
            arr[b+1]-=k;
           
        }
        
        for(int i=1;i<=n;i++)
        {
            arr[i]+=arr[i-1];
            max=Math.max(arr[i],max);
        }

   return max;
    }  

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, m,queries);

        System.out.println(result);
        scanner.close();
    }
}