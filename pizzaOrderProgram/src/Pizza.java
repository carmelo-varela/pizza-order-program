public class Pizza {
    // Member variables for method returning a formatted String of the pizza information

    private String size;
    private String crust;
    private String topping1;
    private String topping2;
    private String sauce;

    // Member variables for method calculating and returning the cost of the pizza

    private Size sizeDesc;
    private Crust crustDesc;
    private Topping topping1Desc;
    private Topping topping2Desc;
    private Sauce sauceDesc;

    private Size sizeCost;
    private Crust crustCost;
    private Topping topping1Cost;
    private Topping topping2Cost;
    private Sauce sauceCost;

    // Constructor

    public Pizza(String size,
                 String crust,
                 String topping1,
                 String topping2,
                 String sauce) {

        this.size = size;
        this.crust = crust;
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.sauce = sauce;

        this.sizeDesc = Size.valueOf(size);
        this.crustDesc = Crust.valueOf(crust);
        this.topping1Desc = Topping.valueOf(topping1);
        this.topping2Desc = Topping.valueOf(topping2);
        this.sauceDesc = Sauce.valueOf(sauce);

        this.sizeCost = Size.valueOf(size);
        this.crustCost = Crust.valueOf(crust);
        this.topping1Cost = Topping.valueOf(topping1);
        this.topping2Cost = Topping.valueOf(topping2);
        this.sauceCost = Sauce.valueOf(sauce);

    }

    // Set Methods

    public void setSize(String newSize){
        this.size = newSize;
        this.sizeDesc = Size.valueOf(newSize);
        this.sizeCost = Size.valueOf(newSize);
    }

    public void setCrust(String newCrust){
        this.crust = newCrust;
        this.crustDesc = Crust.valueOf(newCrust);
        this.crustCost = Crust.valueOf(newCrust);
    }

    public void setTopping1(String newTopping1){
        this.topping1 = newTopping1;
        this.topping1Desc = Topping.valueOf(newTopping1);
        this.topping1Cost = Topping.valueOf(newTopping1);
    }

    public void setTopping2(String newTopping2){
        this.topping2 = newTopping2;
        this.topping2Desc = Topping.valueOf(newTopping2);
        this.topping2Cost = Topping.valueOf(newTopping2);
    }

    public void setSauce(String newSauce){
        this.sauce = newSauce;
        this.sauceDesc = Sauce.valueOf(newSauce);
        this.sauceCost = Sauce.valueOf(newSauce);
    }

    // Get Methods

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getTopping1() {
        return topping1;
    }

    public String getTopping2() {
        return topping2;
    }

    public String getSauce() {
        return sauce;
    }

    // Access Methods for enumerated data

    // ------------------ Descriptions -----------------------

    private String getSizeDesc() {
        return this.sizeDesc.getSizeDesc();
    }

    private String getCrustDesc() {
        return this.crustDesc.getCrustDesc();
    }

    private String getTopping1Desc() {
        return this.topping1Desc.getTopping1Desc();
    }

    private String getTopping2Desc() {
        return this.topping2Desc.getTopping2Desc();
    }

    private String getSauceDesc() {
        return this.sauceDesc.getSauceDesc();
    }

    // ------------------ Values ------------------------------

    private double getSizeValue() {
        return this.sizeCost.getSizeValue();
    }

    private double getCrustValue() {
        return this.crustCost.getCrustValue();
    }

    private double getTopping1Value() {
        return this.topping1Cost.getTopping1Value();
    }

    private double getTopping2Value() {
        return this.topping2Cost.getTopping2Value();
    }

    private double getSauceValue() {
        return this.sauceCost.getSauceValue();
    }

    // Method to calculate pizza 'Base' and 'Total' costs

    private double calcBaseCost() {
        return getSizeValue() + getCrustValue();
    }

    double calcTotalCost() {
        return calcBaseCost() + getSauceValue() + (getTopping1Value() * 5)
                + (getTopping2Value() * 4);
    }

    // Method to return a formatted String of the pizza information

    String getInfo() {

        String s = "";

        s += String.format("TOTAL COST: £%.2f \n",
                calcTotalCost());

        s += String.format("%s SIZE: £%.2f \n",
                getSizeDesc(), getSizeValue());

        s += String.format("%s CRUST: £%.2f \n",
                getCrustDesc(), getCrustValue());

        s += String.format("BASE COST: £%.2f \n",
                calcBaseCost());

        s += String.format("%s TOPPING: 5 × %.2f = %.2f \n",
                getTopping1Desc(), getTopping1Value(), (getTopping1Value() * 5));

        s += String.format("%s TOPPING: 4 × %.2f = %.2f \n",
                getTopping2Desc(), getTopping2Value(), (getTopping2Value() * 4));

        s += String.format("%s SAUCE: £%.2f \n",
                getSauceDesc(), getSauceValue());

        return s;
    }
}
