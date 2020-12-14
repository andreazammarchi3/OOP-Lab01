class ComplexNumCalculator {
    // FIELDS
    int nOpDone; // Number of operations done
    ComplexNum lastRes; // Last result obtained

    // METHODS
    // Initializes the calculator fields
    void build() {
        this.nOpDone = 0;
        this.lastRes = null;
    }

    // Adds n1 to n2 and updates calculator fields
    ComplexNum add(ComplexNum n1, ComplexNum n2) {
        ComplexNum res = new ComplexNum();
        res.re = n1.re + n2.re;
        res.im = n1.im + n2.im;
        this.nOpDone++;
        this.lastRes = res;
        return res;
    }

    // Subtracts n2 to n1 and updates calculator fields
    ComplexNum sub(ComplexNum n1, ComplexNum n2) {
        ComplexNum res = new ComplexNum();
        res.re = n1.re - n2.re;
        res.im = n1.im - n2.im;
        this.nOpDone++;
        this.lastRes = res;
        return res;
    }

    // Multiplies n1 by n2 and updates calculator fields
    ComplexNum mul(ComplexNum n1, ComplexNum n2) {
        ComplexNum res = new ComplexNum();
        res.re = n1.re * n2.re;
        res.im = n1.im * n2.im;
        this.nOpDone++;
        this.lastRes = res;
        return res;
    }

    // Divides n1 by n2 and updates calculator fields
    ComplexNum div(ComplexNum n1, ComplexNum n2) {
        ComplexNum res = new ComplexNum();
        res.re = n1.re / n2.re;
        res.im = n1.im / n2.im;
        this.nOpDone++;
        this.lastRes = res;
        return res;
    }
}
