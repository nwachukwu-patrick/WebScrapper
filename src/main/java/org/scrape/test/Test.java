package org.scrape.test;


import java.text.ParseException;

public class Test {
    Test(Object n){
        System.out.println("I'm a new class from method reference");
    }
    public static void cal(int x, int y){
        System.out.println(x * y);
    }
    public  static void each(Object n){
        System.out.println(n);
    }
    public String timeConversion(String input ) throws ParseException {

        String res = null;
        if(input.substring(8).equalsIgnoreCase("AM")) {
            String str = "" + input.replace('A', ' ');
             res = str.replace('M', 'A') + 'M';
        }else if(input.substring(8).equalsIgnoreCase("PM")) {
            String str = "" + input.replace('P', ' ');
            res = str.replace('M', 'P') + 'M';
        }
        return  res;
    }
//static Logger log = Logger.getLogger(Test.class.getName());
    public static void main(String[] args) throws InterruptedException, ParseException {

// log.debug("Hello this is a debug message");
// log.info("Hello this is  an info message");
//        JAXB jaxb = JAXB.marshal();

    }
}
