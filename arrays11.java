import java.util.*;
class arrays11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("enter index d : ");
        int d = sc.nextInt();

        int ar[] = new int[n];

        for(int i=d; i<n; i++)
        {
            ar[i-d] = arr[i];
        }
        for(int i=0; i<d; i++)
        {
            ar[n-d] = arr[i]; 
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(ar[i]+",");
        }
    }
}