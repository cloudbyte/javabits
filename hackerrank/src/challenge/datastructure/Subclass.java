package challenge.datastructure;

/**
 * Created by Raj on 8/21/16.
 */
public class Subclass {

    public static void main(String[] args){

        int[] a = {1};
        Subclass t = new Subclass();
        t.increment(a);

        System.out.print(a[a.length-1]);

        System.out.println(Math.ceil(-4.7));
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

