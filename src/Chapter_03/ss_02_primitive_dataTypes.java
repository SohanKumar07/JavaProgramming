package Chapter_03;

public class ss_02_primitive_dataTypes {
    public static void main(String[] args) {

        /*
            Primitive data types
            -- byte
            -- short
            -- int
            -- long
            -- float
            -- double
            -- boolean
         */

        byte byteValue1 = 4;
        byte byteValue2 = 5;
        byte byteResult = (byte) (byteValue1 + byteValue2);

        System.out.println("Byte Result is: " + byteResult);

        short shortValue1 = 10;
        short shortValue2 = 7;
        short shortResult = (short) (shortValue1 + shortValue2);

        System.out.println("Short Result is: " + shortResult);

        int a = 5;
        int b = 3;

        System.out.println(a + b);

        long longValue1 = 2L;
        long longValue2 = 3L;
        long longResult = longValue1 + longValue2;

        System.out.println("Long Result is: " + longResult);

        float floatValue1 = 5.7f;
        float floatValue2 = 9.3f;
        float floatResult = floatValue1 + floatValue2;

        System.out.println("Float Result is:" + floatResult);

        double doubleValue1 = 2.0;
        double doubleValue2 = 3.0;
        double doubleResult = doubleValue1 + doubleValue2;
        System.out.println("Double Result is: " + floatResult);

        boolean booleanValue = true;

        System.out.println("Boolean is: " + booleanValue);

        char charValue = 'A';

        System.out.println("char value is: " + charValue);
    }
}
