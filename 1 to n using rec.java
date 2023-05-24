import java.util.*;
class rec1
{
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        sc.close();
        print1ton(1,n);
    }
    public static void print1ton(int i,int n)
    {
        if(i==n)
        {
            System.out.print(n);
            return;
        }
        System.out.print(i+"\t");
        print1ton(i+1,n);
    }
}