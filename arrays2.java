class arrays2
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        
        int i;
        int length = arr.length;
        int sum = 0;

        for(i=0; i<length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("sum of elements : "+sum);
    }
}