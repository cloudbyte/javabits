package challenge.datastructure;

/**
 * Created by Raj on 12/24/16.
 */
public class StringConcat {

    public static void main(String args[]){

        String s1 = "abc";
        String s2 = "def";

        String s3 = s1.concat(s2.toUpperCase());
        System.out.println(s1+s2+s3);

        int a1 = 5;
        for(int i=1; i<3; i++){

            for(int j = 1; j < 3; j++)
            {
                if(a1 == 5)
                {
                    break;
                }
                System.out.println(i*j); //abcdefabcDEF
            }
        }

    }

}
