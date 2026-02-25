//import java.util.*;
class arrays3
{
    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5};
        int i;
        int product = 1;
        int length = arr.length;

        for(i=0; i<length; i++)
        {
            product = product * arr[i];
        }
        System.out.println("product of elements : "+product);
    }
}