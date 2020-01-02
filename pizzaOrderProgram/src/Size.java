public enum Size {
    SMALL("SMALL", 9.45),
    MEDIUM("MEDIUM", 11.87),
    LARGE("LARGE", 15.90);

    private final String sizeDesc;
    private final double sizeValue;

    Size(String sizeDescription, double sizeCost){
        this.sizeDesc = sizeDescription;
        this.sizeValue = sizeCost;
    }

    public String getSizeDesc(){
        return this.sizeDesc;
    }
    public double getSizeValue() {
        return this.sizeValue;
    }
}
