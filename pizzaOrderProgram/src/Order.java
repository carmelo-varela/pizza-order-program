import java.util.*;

public class Order {
    private final ArrayList<Pizza> pizzas;

    Order() {
        this.pizzas = new ArrayList<>();
    }

    void addPizza(Pizza p) {
        pizzas.add(p);
        int i = pizzas.indexOf(p);
    }

    public ArrayList<Pizza> getList(){
        return pizzas;
    }

    // Method for returning string of the whole order

    String getOrderSummary(){
        String s = "";

        for (Pizza p : pizzas) {
            s += p.getInfo() + "\n";
        }

        return s;
    }

    // Methods for calculating and formatting order total costs

    private double getOrderTotal() {
        double d = 0;

        for (Pizza p : pizzas) {
            d += p.calcTotalCost();
        }

        return d;
    }

    String formatOrderTotal() {
        return String.format("£%.2f", getOrderTotal());
    }

    // Method for calcuting the total number of pizzas

    int numberOfPizzas() {
        return pizzas.size();
    }

    // Method for selecting and deleting pizzas

    void removePizza(Pizza p) {
        pizzas.remove(p);
    }
}
