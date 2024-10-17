public class main {


    public int sum(int a, int b) {
        return a + b;
    }


    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль недопустиме");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
       main calc = new main();


        int resultSum = calc.sum(8, 1);
        System.out.println("Сума: " + resultSum);


        double resultDivide = calc.divide(76, 4);
        System.out.println("Ділення: " + resultDivide);
    }
}
