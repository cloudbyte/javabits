package challenge.datastructure;

/**
 * Created by Raj on 8/23/16.
 */
public final class Test1 {


    class Inner{
        void test(){
            if(Test1.this.flag);{
                sample();
            }
        }

    }

    private boolean flag = true;


    public void sample(){
        System.out.println("Sample");
    }

    public Test1(){

        (new Inner()).test();
    }

    public static void main(String args[]){
        new Test1();
    }

}
