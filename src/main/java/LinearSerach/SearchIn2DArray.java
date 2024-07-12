package LinearSerach;

import java.util.Arrays;

public class SearchIn2DArray {

//    public static void main(String[] args) {
//        int [][] arr = {
//                {12,3,4},
//                {34,56,3},
//                {35,67,43}
//        };
//        int target = 34;
//        int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));
//        System.out.println( max(arr));
//
//    }
    static int[] search (int[][] arr,int  target){

        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row,col}; // have to initialize using new
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int [][] arr){
        int max = arr[0][0]; // Integer.MIN_VALUE
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if( arr[row][col] > max) {
                    max = arr[row][col];

                }

            }
        }

        return max;
    }




}
