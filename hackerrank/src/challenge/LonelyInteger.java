package challenge;

import java.util.Arrays;

/**
 * Created by Raj on 12/24/16.
 */
public class LonelyInteger {

    public static void main(String args[]){
        int[] array = { 2, 5, 6, 3, 2, 7, 3, 5, 6};

        int lonelyInt = findLonelyInteger(array);

        System.out.println(lonelyInt);
    }

    private static int findLonelyInteger(int[] input){
        int result = 0;
        for(int i=0; i < input.length; i++){

            result = result^input[i];

        }
        return result;
    }

    private static int findLonelyInteger1(int[] input){
        Arrays.sort(input);
        for(int i=0; i < input.length; i++){
            if((i < 1 || input[i-1] != input[i]) && (i > input.length -2 || input[i] != input[i+1])){
                return input[i];
            }
        }
        return -1;
    }

}
