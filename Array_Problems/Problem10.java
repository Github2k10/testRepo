package Array_Problems;

public class Problem10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 3, 7, 9};
        int[] arr2 = {4, 2, 6, 7, 4, 1};
        boolean[] visited = new boolean[arr2.length];

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j] && !visited[j]){
                    System.out.print(arr1[i] + " ");
                    visited[j] = true;
                    break;
                }
            }
        }
    }
}
