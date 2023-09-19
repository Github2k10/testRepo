package Array_Problems;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 6, 7, 9};
        int[] sortedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                sortedArray[k] = arr1[i];
                i++;
            } else {
                sortedArray[k] = arr2[j];
                j++;
            }

            k++;
        }

        while(i < arr1.length){
            sortedArray[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length){
            sortedArray[k] = arr2[j];
            k++;
            j++;
        }

        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
