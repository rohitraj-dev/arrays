import java.util.*;
class arrays10
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int ar[] = new int[n];
        int j = 0;

        for(int i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        for(int i=(n-1); i>=0; i--)
        {
            ar[j++] = arr[i];
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(ar[i]+",");
        }
        //System.out.println(arr);
        //System.out.println(ar);

    }
}