package Array_Problems;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {34, 53, 63, 93, 32, 11, 83};
        int max = Integer.MIN_VALUE;

        for(int i : arr) 
            if(i > max)
                max = i;


        System.out.println("Maximum element from the array: " + max);

    }
}
