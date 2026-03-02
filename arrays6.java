import java.util.*;
class arrays6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int i;

        for(i=0; i<n; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }

        for(i=0; i<n; i++)
        {
            if(i%2 != 0)
            {
                System.out.print((arr[i]) * 2+",");                
            }
            else
            {
                System.out.print((arr[i]) + 10+",");
            }
        }
    }
}