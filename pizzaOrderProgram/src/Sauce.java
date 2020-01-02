public enum Sauce {
    TOMATO("TOMATO", 0.00),
    PESTO("PESTO", 0.50);

    private final String sauceDesc;
    private final double sauceValue;

    Sauce(String sauceDescription, double sauceCost){
        this.sauceDesc = sauceDescription;
        this.sauceValue = sauceCost;
    }

    public String getSauceDesc() {
        return this.sauceDesc;
    }

    public double getSauceValue() {
        return this.sauceValue;
    }
}
