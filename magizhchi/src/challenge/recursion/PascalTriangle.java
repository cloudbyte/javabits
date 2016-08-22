package challenge.recursion;


/**
 * Created by Raj on 8/21/16.
 *
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 *
 */
public class PascalTriangle {

    public static void main(String args[]){

        int level = 6;

        int[][] array = new int[level][];


        for(int i=0; i<level; i++){

            array[i] = new int[i+1];

            array[i][0] = 1;
            array[i][i] = 1;

            for(int j=1; j <i; j++){

                array[i][j] = array[i-1][j-1] + array[i-1][j];

            }
        }



        for(int i=0; i < level; i++){

            for(int j=0; j< array[i].length; j++){

                System.out.print("  "+array[i][j]);
            }
            System.out.println("");

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        //pascalUsingFormula(level);


    }


    public static void pascalUsingFormula(int rows){

        for(int i =0;i<rows;i++) {
            int number = 1;
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
