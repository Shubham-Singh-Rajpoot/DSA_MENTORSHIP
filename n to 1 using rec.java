import java.util.*;
class rec2
{
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        sc.close();
        printnto1(n);
    }
    public static void printnto1(int n)
    {
        if(n==1)
        {
            System.out.print(n);
            return;
        }
        System.out.print(n+"\t");
        printnto1(n-1);
    }
}