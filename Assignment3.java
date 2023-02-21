class Assignment3{
    
    // Adds all elements in an array
    public static int addList(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}