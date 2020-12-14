class ComplexNum {

    double re;
    double im;

    void build(double re, double im) {
        this.re = re;
        this.im = im;
    }

    boolean equal(ComplexNum num) {
        return (this.re == num.re) && (this.im == num.im);
    }

    String toStringRep() {
        return this.im == 0
            // Special case: real number.
            ? this.re + ""
            // Stringify real part if present
            : (this.re == 0 ? "" : this.re)
                // Add + signum if required (if negative, - is added automatically)
                + (this.re != 0 && this.im > 0 ? "+" : "")
                // Add imaginary part, handle +-1
                + (this.im == 1 ? "" : (this.im == -1 ? "-" : this.im + "")) + "i";
    }
}
