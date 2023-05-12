
//REFACT10: Aquí es donde hemos puesto el OrderLineItem
public class OrderLineItem {
    private String productName;
    private int quantity;
    private double price;


    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice() {
        return price * quantity;
    }
    //REFACT11: Podría poner los atributos en publico, pero sería más correcto por seguridad hacer getters y setters.
    //Así si en un futuro se quiere utilizar ya no habrá problema porque estaran creados.

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}