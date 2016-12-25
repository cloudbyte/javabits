package challenge;

/**
 * Created by Raj on 12/24/16.
 */
public class LonelyInteger {

    public static void main(String args[]){
        int[] array = { 5, 6, 5, 3, 6};

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

}
