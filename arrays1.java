//import java.util.*;
class arrays1
{
    public static void main(String []args)
    {
        //Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, -5, -9, -2, 7};
        System.out.print("Negative elements are : ");
        
        int length = arr.length;
        int i;

        for(i=0; i<length; i++)
        {
            if(arr[i] < 0)
            {
                System.out.print(arr[i]+", ");
            }
        }
    }
}