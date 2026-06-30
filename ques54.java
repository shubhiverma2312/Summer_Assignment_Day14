import java.util.*;
class q54
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,j,x,c=1;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number:");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                for(j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    c++;
                }
                System.out.println("FREQUENCY OF "+x+" = "+c);
                System.exit(0);
            }
        }
        System.out.println("NUMBER NOT FOUND");
    }
}