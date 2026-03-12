import java.util.*;
class arrays15
{
    public static void main(String []args)
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

        int ar[] = new int[n];
        int k = 0;

        for(int i=0; i<=9; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(arr[j] == i)
                    ar[k++] = arr[j];
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(ar[i]+",");
        }
    }
}