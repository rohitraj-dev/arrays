import java.util.*;
class arrays14
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements in array 1 : ");
        int n = sc.nextInt();

        int ar1[] = new int[n];
 
        System.out.println("enter elements of array 1 ");
        for(int i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            ar1[i] = sc.nextInt();
        }

        System.out.print("enter number of elements in array 1 : ");
        int m = sc.nextInt();

        int ar2[] = new int[m];

        System.out.println("enter elements of array 2");
        for(int i=0; i<m; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            ar2[i] = sc.nextInt();
        }

        int arr1[] = new int[n];
        int k = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=9; j++)
            {
                if(ar1[i] == j);
                arr1[k++] = ar1[i];
            }
        }

        int arr2[] = new int[m];
        int l = 0;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<=9; j++)
            {
                if(ar2[i] == j);
                arr2[l++] = ar2[i];
            }
        }

        int arr[] = new int[n+m];

        for(int i=0; i<n; i++)
        {
            arr[i] = ar1[i];
        }
        for(int i=n; i<m; i++)
        {
            arr[i] = ar2[i];
        }

        for(int i=0; i<m+n; i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}