import java.util.*;
class q56
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,j,c;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                c++;
            }
            if(c>0)
            {
                System.out.println(arr[i]+" IS DUPLICATE IN THE ARRAY");
                arr[i]=0;
            }
        }
    }
}