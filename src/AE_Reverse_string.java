package src;

public class AE_Reverse_string {

    public static void main(String[] args) {

        String s = "AA BB CC DD EE FF";

        String[] arr = s.split(" ");

        for(int i = 0 ; i< arr.length/2 ; i++)
        {
            String temp = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = temp;
        }

        String op ="";

        for (String x : arr)
        {
            op = op + x + " ";

        }
        System.out.println(op);


    }
}
