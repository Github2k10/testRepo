package Array_Problems;

public class Problem8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 6, 7, 7};
        int sum = 0;

        for(int i : arr) sum += i;

        System.out.println("Average of elements of array: " + sum/arr.length);
    }
    
}
