class TestComplexNumCalculator {
    public static void main(String[] args) {

        // Initialize calc as a calculator, and create two complex numbers
        ComplexNumCalculator calc = new ComplexNumCalculator();
        ComplexNum n1 = new ComplexNum();
        ComplexNum n2 = new ComplexNum();

        // Set n1 = 1+2i and n2 = 2+3i and print the result of the addiction
        n1.build(1, 2);
        n2.build(2, 3);
        System.out.println("(" + n1.toStringRep() + ") + (" + n2.toStringRep()
        + ") = " + (calc.add(n1, n2)).toStringRep());

        // Print calc infos
        System.out.println("Number of operations done: " + calc.nOpDone);
        System.out.println("Last result: " + calc.lastRes.toStringRep() + "\n");

        // Set n1 = 4+5i and n2 = 6+7i and print the result of the subtraction
        n1.build(4, 5);
        n2.build(6, 7);
        System.out.println("(" + n1.toStringRep() + ") - (" + n2.toStringRep()
        + ") = " + (calc.sub(n1, n2)).toStringRep());

        // Print calc infos
        System.out.println("Number of operations done: " + calc.nOpDone);
        System.out.println("Last result: " + calc.lastRes.toStringRep() + "\n");

        // Set n1 = 8+2i and n2 = 3-i and print the result of the multiplication
        n1.build(8, 2);
        n2.build(3, -1);
        System.out.println("(" + n1.toStringRep() + ") * (" + n2.toStringRep()
        + ") = " + (calc.mul(n1, n2)).toStringRep());

        // Print calc infos
        System.out.println("Number of operations done: " + calc.nOpDone);
        System.out.println("Last result: " + calc.lastRes.toStringRep() + "\n");

        // Set n1 = 10+2i and n2 = 5+i and print the result of the division
        n1.build(10, 2);
        n2.build(5, 1);
        System.out.println("(" + n1.toStringRep() + ") / (" + n2.toStringRep()
        + ") = " + (calc.div(n1, n2)).toStringRep());

        // Print calc infos
        System.out.println("Number of operations done: " + calc.nOpDone);
        System.out.println("Last result: " + calc.lastRes.toStringRep());
    }
}
