import java.util.List;
//REFACT5: Aquí es donde puse el metodo order en esta clase modificando de en vez de <Main.OrderLineItem a ponerlo OrderLineItem puesto que ya no esta en la clase Main.
public class Order {
    private List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        // REFACTOR 13: Metode Inline hacemos el mismo calculo pero en una línea.
        return subtotal + (subtotal * taxRate);
        /*
        double tax = subtotal * taxRate;
        return subtotal + tax;
         */
    }
}