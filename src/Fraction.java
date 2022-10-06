public class Fraction {
    private int numerator = 1;
    private int denominator = 1;
    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public String getFullInfo(){
        return "\nFraction: " + numerator + "/" + denominator;
    }
}
