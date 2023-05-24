import java.util.*;
public class maxrec
{
    static int max=Integer.MIN_VALUE;
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
        findmax(ar,0,n);
        System.out.println("Max value:"+max);
    }
    public static void findmax(int []ar,int i,int n)
    {
        if(i==n)
            return;
        if(ar[i]>max)
            max=ar[i];
        findmax(ar,i+1,n);
    }
}