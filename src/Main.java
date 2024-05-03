public class Main {
    public static void main(String[] args) {

        Fibonacci f1 = new Fibonacci(14,1,2);
        Thread thread1 = new Thread(f1);
        thread1.start();

        Fibonacci f2 = new Fibonacci(14,3,4);
        Thread thread2 = new Thread(f2);
        thread2.start();

        Fibonacci f3 = new Fibonacci(14,5,6);
        Thread thread3 = new Thread(f3);
        thread3.start();


    }
}
