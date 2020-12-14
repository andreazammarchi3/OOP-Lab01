class Train {

    // FIELDS
    int nTotSeats; // Total seats
    int nFirstClassSeats; // First class total seats
    int nSecondClassSeats; // Second class total seats
    int nFirstClassReservedSeats; // First class reserved seats
    int nSecondClassReservedSeats; // second class reserved seats

    // METHODS
    // Creates a new train and sets up his fields
    void build(int nFirstClassSeats, int nSecondClassSeats) {
        this.nTotSeats = nFirstClassSeats + nSecondClassSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }

    // Reserves n seats for the first class
    void reserveFirstClassSeats(int n) {
        this.nFirstClassReservedSeats += n;
    }

    // Reserves n seats for the second class
    void reserveSecondClassSeats(int n) {
        this.nSecondClassReservedSeats += n;
    }

    // Returns the percentage of reserved seats in total
    double getTotOccupancyRatio() {
        return (((double) this.nFirstClassReservedSeats
            + (double) this.nSecondClassReservedSeats) 
            / this.nTotSeats) * 100;
    }

    // Returns the percentage of reserved seats in the first class
    double getFirstClassOccupancyRatio() {
        return ((double) this.nFirstClassReservedSeats
            / this.nFirstClassSeats) * 100;
    }

    // Returns the percentage of reserved seats in the second class
    double getSecondClassOccupancyRatio() {
        return ((double) this.nSecondClassReservedSeats
            / this.nSecondClassSeats) * 100;
    }

    // Sets to 0 the reserved seats
    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}