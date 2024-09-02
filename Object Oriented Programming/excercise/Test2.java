//Test 1 does have errors.
//Does not have doubleValue method,

public class Test2 {
    public static void main(String[] args){

        //OLD LINE : Object x = new Integer(2);
        //FIXED LINE :
        Integer x = new Integer(2);

        
        System.out.println(x.doubleValue());
}}
