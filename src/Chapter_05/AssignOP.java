package Chapter_05;

public class AssignOP {
    public static void main(String[] args) {
//        int a = 10;
//
//        a += 5; // a = a + 5
//        System.out.println("After += : " + a);
//
//        a -= 3;   // a = a - 3
//        System.out.println("After -= : " + a);
//
//        a *= 4; // a = a * 4
//        System.out.println("After *= : " + a);
//
//        a /= 2; // a = a / 2
//        System.out.println("After /= : " + a);
//
//        a %= 3; // a = a % 3
//        System.out.println("After %= : " + a);

        // one more example
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );


        // work from right to left
        int x, y, z;
        x = y = z = 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
