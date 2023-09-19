package Array_Problems;

public class Problem11 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 9, 3};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Maximum element from the array: " + max);
        System.out.println("Minimum element from the array: " + min);
    }
}
