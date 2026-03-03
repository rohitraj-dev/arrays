import java.util.*;
class arrays7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of elements : ");
        int n = sc.nextInt();

        System.out.println("enter "+n+" elements");

        int i;
        int arr[] = new int[n];

        for(i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("enter element to be searched : ");
        int search = sc.nextInt();

        int flag = 0;

        for(i=0; i<n; i++)
        {
            if(search == arr[i])
            {
                flag=1;
                System.out.println("search item found : "+arr[i]);
                break;
            }
        }
    }
}