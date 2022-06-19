package company;
//Write three functions, each function will print some text in specific colour. Create three different threads and run all functions simultaneously.

public class Q45 {
    public static void main(String[] args) {
        Thread t1=new Thread(Q45::fun1);
        Thread t2=new Thread(Q45::fun2);
        Thread t3=new Thread(Q45::fun3);
        t1.start();
        t2.start();
        t3.start();
    }
    public static void fun1()
    {
        System.out.println("Hello");
    }
    public static void fun2()
    {
        System.out.println("Hello1");
    }
    public static void fun3()
    {
        System.out.println("Hello2");
    }
}
