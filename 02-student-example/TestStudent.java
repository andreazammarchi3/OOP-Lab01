class TestStudent {
  public static void main(String[] args) {

    // Create three blank students
    Student gentileLuigi = new Student();
    Student bianchiSimone = new Student();
    Student bracciAndrea = new Student();
     
    // Add their info
    gentileLuigi.build("Luigi", "Gentile", 1015, 2019);
    bianchiSimone.build("Simone", "Bianchi", 1016, 2018);
    bracciAndrea.build("Andrea", "Bracci", 1017, 2017);

    // Print their info
    gentileLuigi.printStudentInfo();
    bianchiSimone.printStudentInfo();
    bracciAndrea.printStudentInfo();
  }
}
