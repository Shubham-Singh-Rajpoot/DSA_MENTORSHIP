import java.util.*;
public class minrec
{
    static int min=Integer.MAX_VALUE;
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
        findmin(ar,0,n);
        System.out.println("Min value:"+min);
    }
    public static void findmin(int []ar,int i,int n)
    {
        if(i==n)
            return;
        if(ar[i]<min)
            min=ar[i];
        findmin(ar,i+1,n);
    }
}