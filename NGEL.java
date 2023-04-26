import java.util.*;
class NGEL
{
    public static int[] nextGreater(int arr[])
    {
        Stack<Integer> stack=new  Stack<>();
        int ans[]=new  int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!stack.isEmpty()&&stack.peek()<=arr[i])
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
        int arr[]={9,8,7,6,5,4,3,2,1};
        int ans[]=nextGreater(arr);
        for(int a:ans)
            System.out.print(a+" ");
    }
}