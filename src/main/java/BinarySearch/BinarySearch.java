package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6,7,12,15,17,19, 30, 40,90};
        int target = 2;

        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    //return the index
    //return -1 if it does not exist
    //sorted array


    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1; // -1 cz == it willl reach end

        while(start <= end){
            //find mid
         //   int mid = ((start + end) /2); //might be possible that it exceeds int range
           int mid = start + (end - start)/ 2;
           if(target < arr[mid]){
               end = mid -1;
           }else if (target > arr[mid]){
               start = mid +1;
           }else {
               return mid;
           }
        }
        return -1;
    }

    //decending order

    static int binarySearchDecending(int [] arr, int target){
        int start = 0;
        int end = arr.length -1; // -1 cz == it willl reach end

        while(start <= end){
            //find mid
            //   int mid = ((start + end) /2); //might be possible that it exceeds int range
            int mid = start + (end - start)/ 2;
            if(target < arr[mid]){
                start = mid +1;
            }else if (target > arr[mid]){
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //
}
