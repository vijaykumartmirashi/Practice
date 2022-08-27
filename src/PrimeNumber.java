public class PrimeNumber
{
    public static void main(String[] args) {
        int n=13;
        int count =0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
              count=  count+1;
            }
        }
        if(count==0)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
