import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.testng.annotations.Test;

public class Lara {
    @Test
    public void testNumbers() {
        int myNumber = 5;
        double d = 4.5;

        System.out.println(myNumber);
        System.out.println(d);
    }


    @Test
    public void testCharsAndStrings() {
        char letterG = 'g';
        String s2;
        s2 = "Who Who Who Fuck!;";

        System.out.println(letterG);
        System.out.println(s2);
    }


    @Test
    public void testConcat() {

        int numberofCookies = 4;
        String message = "I have " + numberofCookies + " cookies";

        System.out.println(message);
    }

    @Test
    public void testBoolean() {
        boolean b = false;
        System.out.println(b);
    }

    @Test
    public void testOperators() {
        boolean value1 = true;
        boolean value2 = false;

        System.out.println(!value1);
        System.out.println(!value2);
        System.out.println(value1 || value2);
        System.out.println(value1&&value2);
    }

    @Test
    public void testPlus() {

            int x = 100 + 50;
            System.out.println(x);
        }


    @Test
    public void testPlus1() {
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }

    @Test
    public void testAdd1() {
        int x = 5;
        ++x;
        System.out.println(x);
    }

    @Test
    public void testDivide() {
        int x = 12;
        int y = 3;
        int sum1 = x/y*2;
        System.out.println(sum1);

    }

    @Test
    public void testModulus() {
        int x = 5;
        int y = 2;
        System.out.println(x % y);
    }
}







    

    
    

                   












