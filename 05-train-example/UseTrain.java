class UseTrain {
    public static void main(String[] args) {
        // TESTING STEPS
        // 1 -> build a train with 40 seats in first class and 60 seats in second class
        Train train = new Train();
        train.build(40, 60);

        // 2 -> reserve 20 seats in the first class and print train infos
        train.reserveFirstClassSeats(20);
        System.out.println("First class occupancy ratio: " + train.getFirstClassOccupancyRatio());
        System.out.println("Total occupancy ratio: " + train.getTotOccupancyRatio());

        // 3 -> reserve 30 seats in the second class and print train infos
        train.reserveSecondClassSeats(30);
        System.out.println("Second class occupancy ratio: " + train.getSecondClassOccupancyRatio());
        System.out.println("Total occupancy ratio: " + train.getTotOccupancyRatio() + "\n");

        // 4 -> delete all the reservations
        train.deleteAllReservations();

        // 5 -> reserve 10 seats in the first class and print train infos
        train.reserveFirstClassSeats(10);
        System.out.println("First class occupancy ratio: " + train.getFirstClassOccupancyRatio());
        System.out.println("Total occupancy ratio: " + train.getTotOccupancyRatio());

        // 6 -> reserve 20 seats in the second class and print train infos
        train.reserveSecondClassSeats(20);
        System.out.println("Second class occupancy ratio: " + train.getSecondClassOccupancyRatio());
        System.out.println("Total occupancy ratio: " + train.getTotOccupancyRatio());
    }
}
