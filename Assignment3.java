import java.util.Scanner;
import java.util.Arrays;

class Assignment3{

    // User is able to declare an array length, then input numbers and calculations are performed on the elements.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired length of array: ");
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Enter element for arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("\nSum of elements: " + addList(arr));
        System.out.println("Product of elements :" + multList(arr));
        System.out.println("Reversed array: " + Arrays.toString(flip(arr)) + "\n");
    }
    
    // Adds all ints in an array and returns sum
    public static int addList(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }

    // Multiplies all ints in an array and returns product
    public static int multList(int[] arr){
        int res = 1;
        for(int i : arr){
            res *= i;
        }
        return res;
    }

    // Reverses the given array
    public static int[] flip(int[] arr){
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            res[arr.length-1-i] = arr[i];
        }
        return res;
    }
}