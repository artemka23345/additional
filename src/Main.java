public class Main {
    public static void main(String[] args) {
        task();
        task2();
        task3();

    }
    public static void task(){
        int a = 5;
        int b = 7;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    public static void task2(){
        int a = 12;
        int b =27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        System.out.println(result);
        result = ~result + 1;
        System.out.println(result);
        result = ~result - 1;
        System.out.println(result);


    }
    public static void task3(){
        int a;
        for (int i = 100; i < 999; i++) {
            a = i;
            int b = a % 100 / 10;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
