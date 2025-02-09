package com.oca.java.classes.operators;

public class LogicalOperatorDemo {
    public static void main(String[] args) {
        //* Using AND (&&) operator
        int a = 10;
        int b = 20;
        boolean result = a > 20 && b > 10;
        // a > 20 && b > 10
        // F  &&   T = FALSE
        //System.out.println("result: " + result);

        //* Using OR (||) operator
        boolean result2 = a > 20 || b > 10;
        // FALSE || TRUE = TRUE
        //System.out.println("result2: " + result2);

        //* Using NOT (!) operator
        boolean result3 = (!(b > 10));
        //False
        //System.out.println("result3: " + result3);


        //* Using NOT (!) with a false condition
        boolean result4 = (!(a > 20));

        //System.out.println("result4: " + result4);

        //* Using NOT (!) with a boolean value
        boolean isJavaFun = true;
        System.out.println(!isJavaFun);



    }
}
