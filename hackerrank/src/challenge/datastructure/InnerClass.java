package challenge.datastructure;

/**
 * Created by Raj on 8/23/16.
 */
public final class InnerClass {

    private boolean flag = true;

    class Inner{
        void test(){
            if(InnerClass.this.flag);{
                sample();
            }
        }
    }

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
