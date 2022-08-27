package com;

public class Frequency
{
    public static void main(String[] args)
    {
        int []arr = new int[]{1,5,5,8,6,7,9,6,5};
        int freq[]=new int[arr.length];
        int visited=-1;
        for (int i=0; i< arr.length;i++)
        {
            int count=1;
            for (int j=i+1; j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j]=visited;
                }
            }
            if (freq[i]!=visited)
            {
               freq[i]=count ;
            }
            System.out.println("--------------------------");
        }
        for (int i=0;i< arr.length;i++)
            if (freq[i]!=visited)
            {
                System.out.println(arr[i]+ "    "+freq[i]);

            }
    }

}
