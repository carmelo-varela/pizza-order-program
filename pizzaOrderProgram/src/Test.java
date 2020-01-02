public class Test {
    public static void main(String[] args) {

        System.out.println("__________________________________________________________________________________________________\n");
        System.out.println("PIZZA CLASS TESTS");
        System.out.println("__________________________________________________________________________________________________\n");

        System.out.println("// CREATE PIZZA WITH FOLLOWING DATA :\n\n" +
                ">>> MEDIUM\n" +
                ">>> THIN\n" +
                ">>> EXTRA_CHEESE\n" +
                ">>> CHILLI\n" +
                ">>> PESTO\n");

        Pizza pizza = new Pizza("MEDIUM", "THIN",
                "EXTRA_CHEESE", "CHILLI", "PESTO");
        System.out.println("[ PIZZA DISPLAY ]\n");
        System.out.println(pizza.getInfo());

        System.out.println("// EDIT PIZZA WITH FOLLOWING DATA :\n\n" +
                ">>> SMALL\n" +
                ">>> CHILLI\n" +
                ">>> PEPPERONI\n" +
                ">>> PESTO\n");
        pizza.setSize("SMALL");
        pizza.setTopping1("CHILLI");
        pizza.setTopping2("PEPPERONI");
        pizza.setSauce("PESTO");
        System.out.println("[ PIZZA DISPLAY ]\n");
        System.out.println(pizza.getInfo());

        System.out.println("__________________________________________________________________________________________________\n");
        System.out.println("ORDER CLASS TESTS");
        System.out.println("__________________________________________________________________________________________________\n");

        Order order = new Order();

        Pizza pz1 = new Pizza("MEDIUM", "THIN",
                "EXTRA_CHEESE", "CHILLI", "PESTO");
        order.addPizza(pz1);

        Pizza pz2 = new Pizza("MEDIUM", "STUFFED",
                "OLIVES", "ONION", "PESTO");
        order.addPizza(pz2);

        Pizza pz3 = new Pizza("MEDIUM", "STUFFED",
                "OLIVES", "ONION", "PESTO");
        order.addPizza(pz3);

        Pizza pz4 = new Pizza("SMALL", "THIN",
                "OLIVES", "OLIVES", "PESTO");
        order.addPizza(pz4);

        System.out.println("// RETURN ORDER INFO\n");
        System.out.println("[ ORDER SUMMARY DISPLAY ]\n");
        System.out.println(order.getOrderSummary());

        System.out.println("[ ORDER TOTAL DISPLAY ]\n");
        System.out.println(order.formatOrderTotal() + "\n");

        System.out.println("[ TOTAL NUMBER OF PIZZAS ]\n");
        System.out.println(order.numberOfPizzas() + "\n");

        System.out.println("// SELECT AND REMOVE A PIZZA + RETURN ORDER INFO\n");
        order.removePizza(pz4);

        System.out.println("[ ORDER SUMMARY DISPLAY ]\n");
        System.out.println(order.getOrderSummary());

        System.out.println("[ ORDER TOTAL DISPLAY ]\n");
        System.out.println(order.formatOrderTotal() + "\n");

        System.out.println("[ TOTAL NUMBER OF PIZZAS ]\n");
        System.out.println(order.numberOfPizzas() + "\n");

        System.out.println("// SELECT AND EDIT A PIZZA (pz3) WITH FOLLOWING DATA + RETURN ORDER INFO:\n\n" +
                ">>> MEDIUM to LARGE\n" +
                ">>> ONIONS to CHILLI\n");
        pz3.setSize("LARGE");
        pz3.setTopping2("CHILLI");

        System.out.println("[ ORDER SUMMARY DISPLAY ]\n");
        System.out.println(order.getOrderSummary());

        System.out.println("[ ORDER TOTAL DISPLAY ]\n");
        System.out.println(order.formatOrderTotal() + "\n");

        System.out.println("[ TOTAL NUMBER OF PIZZAS ]\n");
        System.out.println(order.numberOfPizzas() + "\n");

    }
}
