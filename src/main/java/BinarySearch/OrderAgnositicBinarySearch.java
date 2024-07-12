package BinarySearch;

public class OrderAgnositicBinarySearch {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6,7,12,15,17,19, 30, 40,90};
        int target = 4;

        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1; // -1 cz == it willl reach end

        //find whether the array is sorted in accending or decending
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        // boolean isAsc = arr[start] < arr[end];


        while(start <= end){
            //find mid
            //   int mid = ((start + end) /2); //might be possible that it exceeds int range
            int mid = start + (end - start)/ 2;

            if(arr[mid] ==target){
                return mid;
            }
            if(isAsc){

                if(target > arr[mid]){
                    start = mid +1;
                }else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }else {
                if(target < arr[mid]){
                    start = mid +1;
                }else if (target > arr[mid]){
                    end = mid -1;
                }
            }
        }
        return -1;
    }
    }


