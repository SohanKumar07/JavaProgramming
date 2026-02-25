package Chapter_05;

public class RelationalOP {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(a == b);     // 10 == 5 -- false
        System.out.println(a!= b);      // 10 != 5 -- ture
        System.out.println(a > b);      // 10 > 5 -- true
        System.out.println(a < b);      // 10 < 5 -- false
        System.out.println(a >= b);     // 10 > 5 or 10 = 5 -- true
        System.out.println(a <= b);     // 10 < 5 or 10 = 5 -- false
    }
}
