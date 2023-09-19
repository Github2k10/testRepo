package Array_Problems;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;

        for(int i : arr) sum += i;

        System.out.println("Sum of array elements: " + sum);
    }
}
