import java.util.*;
class arrays8
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

        System.out.print("enter target sum : ");
        int target = sc.nextInt();

        for(int i=0; i<n-1; i++)
        {
            int a = arr[i];
            for(int j=i+1; j<n; j++)
            {
                int b = arr[j];
                int sum = a + b;

                if(sum == target)
                {
                    System.out.println("True");
                    System.out.println(a+","+b);
                    break;
                }
                else
                {
                    System.out.println("False");
                }
            }
        }
    }
}