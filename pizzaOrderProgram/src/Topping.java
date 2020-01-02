public enum Topping {
    NONE("NONE", 0.00),
    OLIVES("OLIVE", 0.08),
    EXTRA_CHEESE("EXTRA CHEESE", 0.02),
    CHILLI("CHILLI", 0.06),
    PEPPERONI("PEPPERONI", 0.10),
    MUSHROOM("MUSHROOM", 0.03),
    ROCKET("ROCKET", 0.05),
    JALAPENOS("JALAPENOS", 0.20),
    ONION("ONION", 0.07),
    ANCHOVY("ANCHOVY", 0.09);

    private final String toppingDesc;
    private final double toppingValue;

    Topping(String toppingDescription, double toppingCost){
        this.toppingDesc = toppingDescription;
        this.toppingValue = toppingCost;
    }

    public String getTopping1Desc(){
        return this.toppingDesc;
    }

    public double getTopping1Value(){
        return this.toppingValue;
    }

    public String getTopping2Desc(){
        return this.toppingDesc;
    }

    public double getTopping2Value(){
        return this.toppingValue;
    }
}
