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

        printPascal(level);
        System.out.println("");
        System.out.println("");
        pascalUsingFormula(level);
    }


    public static void pascalUsingFormula(int rows){
        for(int i =0;i<rows;i++) {
            int number = 1;
            System.out.format("%"+(rows-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0) {
            return 1;
        } else if (j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}
