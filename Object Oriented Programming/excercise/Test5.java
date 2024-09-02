//Test 5 does not have errors.
//No method doX() defined that accepts short arguments.

public class Test5 {
    
    int doX(Long x,Long y){
        return 1;
    }

    int doX(Integer x, Integer y){
        return 2;
    }

    double doX(Double x, Double y){
        return 3.5;
    }

    //ADDED METHOD
    int doX(short x, short y){ 
        return 4;
    }
    //////////////////////

    public static void main(String[] args){
        new Test5().go();
    }

    void go() {
        short s=7;
        System.out.print (doX(s,s)+" ");
    }

}
