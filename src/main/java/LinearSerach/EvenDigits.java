package LinearSerach;

public class EvenDigits {

//    public static void main(String[] args) {
//        int[] arr = {12,345,2,6,7896};
//        System.out.println(findNumbers2(arr));
//        System.out.println(digits2(2345));
//    }

    static int findNumbers(int[] arr){
       int count = 0;
        for (int num: arr) {
            if(even(num)){
                count++;
            }
        }
       return count;
    }

    private static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;

        //return numberOfDigits % 2 ==0;
    }

    //function to check whether the number containt even number of digits
    private static int digits (int num) {
        //if number is negative make it positive

        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

       int count =0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        return count;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
       }
            return (int) (Math.log10(num) + 1);
        }


//        public  int findNumbers2( int[] nums){
//            int res=0;
//
//            for(int i=0;i<nums.length;i++){
//                int count=0;
//                while(nums[i]!=0){
//                    count++;
//                    nums[i]=nums[i]/10;
//                }
//                if(count % 2 ==0){
//                    res++;
//                }
//            }
//            return res;
//        }


}

