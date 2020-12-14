class Recognizer {

    // FIELDS
    int next;
    boolean success;

    // METHODS
    // Sets up the recognizer
    void build() {
        this.next = 1;
        success = true;
    }
    
    // Checks if the next number is the expected one
    boolean check(int actual, int next) {
        if(actual != this.next) {
            this.success = false;
        }
        this.next = next;
        return success;
    }

    // Checks if the next number is 2
    boolean check1(int n) {
        return check(n, 2);
    }

    // Checks if the next number is 3
    boolean check2(int n) {
        return check(n, 3);
    }

    // Checks if the next number is 4
    boolean check3(int n) {
        return check(n, 4);
    }

    // Checks if the next number is 1
    boolean check4(int n) {
        return check(n, 1);
    }

    // Resets the recognizer
    void reset() {
        this.build();
    }

    // Returns the next expected number
    int nextExpextedInt() {
        return this.next;
    }
}
