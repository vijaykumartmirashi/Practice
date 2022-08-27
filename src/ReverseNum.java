public class ReverseNum
{
    // polindrome
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int rem ;
        int temp=num;
        while (num != 0) {
            rem = num % 10;
            num = num / 10;
            rev = rev*10+rem;

            //System.out.println(rev);
        }
        if(rev==temp)
        {
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not polindrome");
        }
    }
}
