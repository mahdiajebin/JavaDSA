package LinearSerach;

public class LinearSearch {

    public static void main(String[] args) {
//        int [] nums = {23,45,1,3,45, 6,67,34,64,56,34,78,-3};
//        int target = 36;
//        int ans = linearSearch(nums,target);
//        System.out.println(" at index " + ans);
        int [] nums = {23,45,1,3,45, 6,67,34,64,56,34,78,-3};
        int target = 45;
        int ans = linearSearch2(nums,target);
        System.out.println(" element value " + ans);


    }

    //search in the array: return the index if item found
    //otherwise if item is not found return -1;

    static int linearSearch(int[] arr, int target){
        if(arr.length ==0 ){
            return -1;
        }

        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if its = target
            int element = arr[i]; // the values for array
            if (element == target){ // if element matches the target
                return i; // return the index
            }

        }
    // this line will execute if none of the return statemnt above was executed
        // target not found //
        return -1;

    }

    // search for the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length ==0 ){
            return -1;
        }

        //run a for loop
        // the values for array
        for (int element : arr) {
            //check for element at every index if its = target
            if (element == target) { // if element matches the target
                return element; // return the element
            }

        }
        // this line will execute if none of the return statemnt above was executed
        // target not found //
        return -1;

    }
    // search for the target and return the element
    static int linearSearch3(int[] arr, int target){
        if(arr.length ==0 ){
            return -1;
        }

        //run a for loop
        // the values for array
        for (int element : arr) {
            //check for element at every index if its = target
            if (element == target) { // if element matches the target
                return element; // return the element
            }

        }
        // this line will execute if none of the return statemnt above was executed
        // target not found //
        return Integer.MAX_VALUE;

    }

}


