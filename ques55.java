import java.util.*;
class q55
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,x=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                x=i;
            }
        }
        arr[x]=0;
        max=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                x=i;
            }   
        }
        System.out.println("SECOND LARGEST NUMBER IS "+max+" AT POSITION "+(x+1));
    }
}