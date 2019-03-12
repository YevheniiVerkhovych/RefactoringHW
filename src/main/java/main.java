
public class main {
    public static void main (String[] args) {

        manipulate.addition(6,4);
        manipulate.subtraction(6,4);
        manipulate.multiply(6,4);
        manipulate.divide(6,4);
        manipulate.concat("6","4");
    }
}
class manipulate {

    public static <T> void printResult(T a) {
        System.out.println("Result is : " + a);
    }

    public static void addition(int a, int b) {
        printResult(a + b);
    }

    public static void subtraction(int a, int b) {
        printResult(a - b);
    }

    public static void multiply(int a, int b) {
        printResult(a * b);
    }

    public static void divide(int a, int b) {
      // try {
            printResult(a / b);
      // } catch (ArithmeticException e) {
      //    printResult("You should not divide a number by zero!");
      //  }
    }

    public static void concat(String a, String b) {
        printResult("" + a + b);
    }
}

