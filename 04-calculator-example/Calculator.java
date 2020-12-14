class Calculator {

    int nOpDone;
    double lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;
    }

    // Sum a + b
    double add(double a, double b) {
        this.nOpDone++;
        this.lastRes = a + b;
        return this.lastRes;
    }

    // Subtraction a - b
    double sub(double a, double b) {
        this.nOpDone++;
        this.lastRes = a - b;
        return this.lastRes;
    }

    // Multiplication a * b
    double mul(double a, double b) {
        this.nOpDone++;
        this.lastRes = a * b;
        return this.lastRes;
    }

    // Division a / b
    double div(double a, double b) {
        this.nOpDone++;
        this.lastRes = a / b;
        return this.lastRes;
    }
}
