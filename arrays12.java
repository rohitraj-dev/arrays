import java.util.*;
class arrays12
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

        System.out.print("enter element to be searched : ");
        int search = sc.nextInt();

        int flag = 0;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == search)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("search item found");
        else
            System.out.println("search item missing");
    }
}