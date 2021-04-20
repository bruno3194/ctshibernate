package com.ds.handson;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
       Integer a[] = new Integer[arr.size()];//***Very important conversion to array*****
        a=(Integer[]) arr.toArray(a);
int size=a.length;
int temp;
for(int i=0;i<d;i++){
    temp=a[0];
    for(int j=0;j<size-1;j++){
        a[j]=a[j+1];
    }
    a[size-1]=temp;
    }
    return Arrays.asList(a);
 }

}

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.rotateLeft(d, arr);

      result.forEach((x)->System.out.print(x+" "));
     
    }
}