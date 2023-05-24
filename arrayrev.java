import java.util.*;
public class arrayrev
{
    public static void main(String args[])
    {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" elements:");
        int ar[]=new  int[n];
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        sc.close();
        printrev(ar,n-1);
    }
    public static void printrev(int []ar,int n)
    {
        if(n==0)
        {
            System.out.print(ar[n]);
            return;
        }
        System.out.print(ar[n]+"\t");
        printrev(ar,n-1);
    }
}