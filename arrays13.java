import java.util.*;
class arrays13
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        int ar[] = new int[n];
        int j = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == 0)
                ar[j++] = arr[i];
        }
        for(int i=0; i<n; i++)
        {
            if(arr[i] == 1)
                ar[j++] = arr[i];
        }

        for(int i=0 ; i<n; i++)
        {
            System.out.print(ar[i]+",");
        }
    }
}