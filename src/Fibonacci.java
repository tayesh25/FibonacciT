public class Fibonacci implements FiboLike,Runnable{
    // Fields
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;
    int number3;

    public Fibonacci(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate() {
        try {
            System.out.println(number1);
            System.out.println(number2);
            for (int i = 0; i < amountofNumbersInSequence; i = i + 1) {
                int x = number2 + number1;
                System.out.println(x);

                number1 = number2;
                number2 = x;
                Thread.sleep(10);
            }
        } catch (Exception ex) {}
    }

    @Override
    public void run() {
        calculate();
    }
}

