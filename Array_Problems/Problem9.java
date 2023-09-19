package Array_Problems;

public class Problem9 {
    public static void main(String[] args) {
        int[] arr = {1, 24, 4, 23, -12, 3, -23};
        int target = -12;
        boolean flag = false;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                flag = true;
                index = i;
            }
        }

        if(flag){
            System.out.println("Index of target element: " + index);
        } else {
            System.out.println("target not found in the array");
        }
    }
    
}
