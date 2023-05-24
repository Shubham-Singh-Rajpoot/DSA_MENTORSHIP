import java.util.*;
public class arraynormal
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
        printnormal(ar,0,n);
    }
    public static void printnormal(int []ar,int i,int n)
    {
        if(i==n)
            return;
        System.out.print(ar[i]+"\t");
        printnormal(ar,i+1,n);
    }
}