package challenge.datastructure;

/**
 * Created by Raj on 8/23/16.
 */
public final class InnerClass {


    class Inner{
        void test(){
            if(InnerClass.this.flag);{
                sample();
            }
        }

    }

    private boolean flag = true;


    public void sample(){
        System.out.println("Sample");
    }

    public InnerClass(){

        (new Inner()).test();
    }

    public static void main(String args[]){
        new InnerClass();
    }

}
