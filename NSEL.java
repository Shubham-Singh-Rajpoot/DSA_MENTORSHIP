import java.util.*;
class NSEL
{
    public static int[] nextSmaller(int arr[])
    {
        Stack<Integer> stack=new  Stack<>();
        int ans[]=new  int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&stack.peek()>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int ans[]=nextSmaller(arr);
        for(int a:ans)
            System.out.print(a+" ");
    }
}