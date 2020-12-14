class TestRecognizer {
   public static void main(String args[]) {

          // 1 -> create a recognizer
          Recognizer recognizer = new Recognizer();
          recognizer.build();

          // 2 -> Testing a correct basic sequence
          System.out.println("The next expected int is: " + recognizer.nextExpextedInt());
          System.out.println("Now the result of the check is: " + recognizer.check1(1));
          System.out.println("The next expected int is: " + recognizer.nextExpextedInt());
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("The next expected int is: " + recognizer.nextExpextedInt());
          System.out.println("Now the result of the check is: " + recognizer.check3(3));
          System.out.println("The next expected int is: " + recognizer.nextExpextedInt());
          System.out.println("Now the result of the check is: " + recognizer.check4(4) + "\n");

          /*
           * 3 -> Testing some sequences:
           *   1) 1,2,3,4,1,2,3
           *   2) 1,2,3,4,5
           *   3) 1,2,3,4,5,2,3
           *   4) 1,2,3,1,2,3,4
           */

          // 1)
          System.out.println("Now the result of the check is: " + recognizer.check1(1));
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("Now the result of the check is: " + recognizer.check3(3));
          System.out.println("Now the result of the check is: " + recognizer.check4(4));
          System.out.println("Now the result of the check is: " + recognizer.check1(1));
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("Now the result of the check is: " + recognizer.check3(3) + "\n");

          // 2)
          System.out.println("Now the result of the check is: " + recognizer.check1(1));
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("Now the result of the check is: " + recognizer.check3(3));
          System.out.println("Now the result of the check is: " + recognizer.check4(4));
          System.out.println("Now the result of the check is: " + recognizer.check1(5) + "\n");

          // 3)
          System.out.println("Now the result of the check is: " + recognizer.check1(1));
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("Now the result of the check is: " + recognizer.check3(3));
          System.out.println("Now the result of the check is: " + recognizer.check4(4));
          System.out.println("Now the result of the check is: " + recognizer.check1(5));
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("Now the result of the check is: " + recognizer.check3(3) + "\n");

          // 4)
          System.out.println("Now the result of the check is: " + recognizer.check1(1));
          System.out.println("Now the result of the check is: " + recognizer.check2(2));
          System.out.println("Now the result of the check is: " + recognizer.check3(3));
          System.out.println("Now the result of the check is: " + recognizer.check4(1));
          System.out.println("Now the result of the check is: " + recognizer.check1(2));
          System.out.println("Now the result of the check is: " + recognizer.check2(3));
          System.out.println("Now the result of the check is: " + recognizer.check3(4));
    }
}
