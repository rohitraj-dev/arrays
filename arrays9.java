import java.util.*;
class arrays9
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

        int max = arr[0];
        int second_max = arr[0];

        for(int i=0; i<n; i++)
        {
            if(max < arr[i])
            {
                second_max = max;
                max = arr[i];
                //second_max = max;
            }
            else if(second_max < arr[i] && arr[i] < max)
            {
                second_max = arr[i];
            }
        }

        System.out.println("largest element : "+max);
        System.out.println("Second largest element : "+second_max);
    }
}