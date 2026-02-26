import java.util.*;
class arrays4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 elements ");

        int arr[] = new int[10];
        //int[] arr;
        int i;

        for(i=0; i<10; i++)
        {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for(i=0; i<10; i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        System.out.println("largest element : "+max);

    }
}