package LinearSerach;

public class MaxWealth {
//    public static void main(String[] args) {
//
//    }

    public int maximumWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum= 0;  // when you start take the sum for that row
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum = rowsum + accounts[person][account];
            }

            //now we have sum of account of person
            //check with overalanswer;
            if(rowsum > ans){
                ans = rowsum;
            }

        }
        return ans;
    }


}
