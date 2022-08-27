public class K_ArrayElement_Max_Min
{
    public static void main(String[] args) {
        int arr[]= new int[]{5,8,12,7,6,2,4};
        int k=4;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1)
            {
                System.out.println("k Max element:"+arr[i]);
                break;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
