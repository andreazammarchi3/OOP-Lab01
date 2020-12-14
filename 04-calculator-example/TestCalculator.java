class TestCalculator {
  public static void main(String[] args) {

    // Initialize calc as a Calculator
    Calculator calc = new Calculator();

    // Set to 0 nOpDone and lastRes
    calc.build();

    // List of operations to do with Calculator
    // First is SUM
    System.out.println("1 + 2 = " + calc.add(1, 2));
    System.out.println("Number of operations done: " + calc.nOpDone);
    System.out.println("Last result: " + calc.lastRes + "\n");

    // Secondi is SUBTRACTION
    System.out.println("-1 - 2 = " + calc.sub(-1, 2));
    System.out.println("Number of operations done: " + calc.nOpDone);
    System.out.println("Last result: " + calc.lastRes + "\n");

    // Third is MULTIPLICATION
    System.out.println("6 * 3 = " + calc.mul(6, 3));
    System.out.println("Number of operations done: " + calc.nOpDone);
    System.out.println("Last result: " + calc.lastRes + "\n");

    // Last is DIVISION
    System.out.println("8 / 4 = " + calc.div(8, 4));
    System.out.println("Number of operations done: " + calc.nOpDone);
    System.out.println("Last result: " + calc.lastRes);
  }
}
