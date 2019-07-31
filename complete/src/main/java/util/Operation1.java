package util;
import java.io.*;
import java.lang.*;

class Operation1 {

    static int getMin(int arr[])
    {
        int res = arr[0];

        for (int i = 1; i < arr.length; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

    static int getMax(int arr[])
    {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = Math.max(res, arr[i]);
        return res;
    }

	public static void main (String[] args) {
	    int arr[]={0,5,7,2,6,12,24,16,1,64,19};

	    System.out.print("Initial Array : ");
	    for(int a:arr){
            System.out.print(" "+a);
        }

	    int minValue = getMin(arr);

	    int maxValue = getMax(arr);

	    int newArr[] = new int[(arr.length/2)];

	    newArr[0] = minValue;
	    newArr[newArr.length-1] = maxValue;

	    int range = maxValue - minValue + 1;


	    for (int i=1;i<=newArr.length-2;i++) {
            int rand = (int)(Math.random() * range) + minValue;
            newArr[i] = rand;
        }

        System.out.print("Final Array : ");
        for(int a:newArr){
            System.out.print(" "+a);
        }
	}
}