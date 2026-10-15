package ex3;

public class Main {
    public static void main(String[] args) {
        Time t0 = new Time();
        System.out.print("t0 = new Time()           -> ");
        t0.display();

        Time t1 = new Time(23, 59, 50);
        System.out.print("t1 = 23:59:50 + 20 s       -> ");
        t1.addSeconds(20);
        t1.display();

        Time t2 = new Time(0, 0, 10);
        System.out.print("t2 = 00:00:10 - 20 s       -> ");
        t2.subtractSeconds(20);
        t2.display();

        Time t3 = new Time(8, 30, 0);
        System.out.print("t3 = 08:30:00 + 3725 s     -> ");
        t3.addSeconds(3725);                    // 1 h 2 min 5 s
        t3.display();

        Time t4 = new Time(12, 0, 0);
        System.out.print("t4 = 12:00:00 + 2 days     -> ");
        t4.addSeconds(2 * 86400);               // a full number of days changes nothing
        t4.display();

        Time t5 = new Time(25, 61, -1);         // invalid input
        System.out.print("t5 = new Time(25, 61, -1)  -> ");
        t5.display();
    }
}
