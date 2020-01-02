public enum Crust {
    THIN("THIN", 1.08),
    DEEP("DEEP", 1.10),
    STUFFED("STUFFED", 2.14);

    private final String crustDesc;
    private final double crustValue;

    Crust(String crustDescription, double crustCost){
        this.crustDesc = crustDescription;
        this.crustValue = crustCost;
    }

    public String getCrustDesc() {
        return this.crustDesc;
    }

    public double getCrustValue() {
        return this.crustValue;
    }
}
