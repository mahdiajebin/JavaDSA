package LinearSerach;

import java.util.Arrays;

public class TwoSum {

//    public static void main(String[] args) {
//        int[] arr = {3,7,2,4};
//        System.out.println(Arrays.toString(twoSum(arr, 9)));
//    }


    //Time complexity O(n)^2
        public static int[] twoSum(int[] nums, int target) {

            for(int i =0;i<nums.length; i++ ){
                int tocheck = target - nums[i];
                for(int j=i+1; j<nums.length; j++){
                    if (nums[j] == tocheck){
                        return new int[]  {i, j};
                    }
                }

            }
            return new int[] {-1,-1};
        }


        //Using Map
    

    }

