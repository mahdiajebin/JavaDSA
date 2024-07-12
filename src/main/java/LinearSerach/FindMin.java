package LinearSerach;

public class FindMin {

//    public static void main(String[] args) {
//        int [] array = {89,44,36,35,3,67,2,844,456,};
//        System.out.println(min(array));
//    }

    //assume arr.length != 0

    static int min(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] > min) { // if current value  is less than the currnt minimum then set value of (i) to min;
                arr[i] = min;
            }
        }
        return min;
    }



}
