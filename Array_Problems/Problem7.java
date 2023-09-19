package Array_Problems;

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 6, 7, 8, 34, 22, 33};
        int count = 0;

        for(int i : arr){
            if(i % 2 == 0)
                count++;
        }

        System.out.println("Count of even numbers in the array: " + count);
    }
}
