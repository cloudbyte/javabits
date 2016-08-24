package challenge.datastructure;

/**
 * Created by Raj on 8/21/16.
 */
public class Test {

    public static void main(String[] args){

        int[] a = {1};
        Test t = new Test();
        t.increment(a);
        System.out.print(a[a.length-1]);

        System.out.println(Math.ceil(-4.7));

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
                System.out.println(i*j);
            }
        }







    }

    private void increment(int[] a) {
        a[a.length-1]++;

        B o = new B();

        if((o instanceof B) && (! (o instanceof A))){

            System.out.println("A11");
        }

        if((o instanceof B) && (! (o instanceof C))){

            System.out.println("B11");
        }
        if(o instanceof  B){
            System.out.println("C11");
        }
    }


    class A{

    }

    class B extends A{

    }

    class C extends B{

    }



}

