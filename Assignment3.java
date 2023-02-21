import java.util.Scanner;

class Assignment3{

    // User is able to declare an array length, then input numbers and calculations are performed.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired length of array: ");
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            System.out.printf("Enter element for arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println("\nSum of elements: " + addList(arr));
        System.out.println("Product of elements :\n" + multList(arr));
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
}