package com;
//to find the elements of array present in even position
public class ArrayEvenPosition
{
    public static void main(String[] args)
    {
        int arr[]=new int[]{1,2,3,4,5,6,7};
        System.out.println( "Elements of given array present on even position:");
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            System.out.println(arr[i]);
        }
    }
}
