import java.util.*;
class q53
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,x;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be searched:");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("ELEMENT FOUND AT POSITION : "+(i+1));
                System.exit(0);
            }
        }
        System.out.println("ELEMENT NOT FOUND");
    }
}