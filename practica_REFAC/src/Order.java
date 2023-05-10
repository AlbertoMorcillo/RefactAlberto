import java.util.List;
//REFACT5: Aquí es donde puse el metodo order en esta clase.
public class Order {
    private List<Main.OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<Main.OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (Main.OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}