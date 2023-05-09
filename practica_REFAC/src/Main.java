import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //REFACT2:Cambio el scanner poniendo luefo del static main para que sea global y pueda usarse en todos los metodos
        //Scanner scan = new Scanner(System.in);

        String p = "Proves";
        mostrarMenu();

//        int opcio;
//        do {
//            //REFACT1: Extracción de metodo para el menú.
//            System.out.println("1. "/* Añado Comparar d*/);
//            System.out.println("2. ");
//            System.out.println("3. ");
//            System.out.println("4. ");
//            System.out.println("5. ");
//            System.out.println("0. Acabar");
//
//            opcio = scan.nextInt();
//            scan.nextLine();
//            switch (opcio) {
//                case 1:
//                    System.out.println("intro: ");
//                    int num1 = scan.nextInt();
//                    System.out.println("intro: ");
//                    int num2 = scan.nextInt();
//                    if (max(num1,num2)) {
//                        System.out.println("aaa");
//                    }
//                    else System.out.println("bbb");
//                    break;
//                case 2:
//                    double a=2;
//                    double b=3;
//                    double c=1;
//                    calcEquacioSegongrau(a, b, c);
//                    break;
//                case 3:
//                    List<OrderLineItem> lineItems = null;
//                    Order asd = new Order(lineItems, 5.5);
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
//            }
//        } while (opcio != 0);
    }

    public static boolean max(int a, int b) {
        if (a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }

    public static void calcEquacioSegongrau(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Equation has no roots");
        }
    }

    public static class Human {
        private String name;
        private String age;
        private String country;
        private String city;
        private String street;
        private String house;
        private String quarter;

        public String obtenirAdrecaCompleta() {
            StringBuilder result = new StringBuilder();
            return result
                    .append(country)
                    .append(", ")
                    .append(city)
                    .append(", ")
                    .append(street)
                    .append(", ")
                    .append(house)
                    .append(" ")
                    .append(quarter).toString();
        }
    }

    public static class Order {
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
            double tax = subtotal * taxRate;
            return subtotal + tax;
        }
    }

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
    }

    public class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }

}

    //REFACT1: Aquí lo ponemos como metodo para que quede más limpio el main, además le añadí algún titulo al menú para cada opcion para saber que hace cada opción.
    public static void mostrarMenu() {
        int opcio;
        do {
            //REFACT1: Extracción de metodo para el menú.
            System.out.println("1.Comparar números y decir cúal de los dos es más grande (aaa el primero bbb el resto) "/* titulo*/);
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    //REFACT3: Extracción de metodo. Creamos un metodo llamado compararNumeros que nos hara esto mismo.
                    /*System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    if (max(num1, num2)) {
                        System.out.println("aaa");
                    } else System.out.println("bbb");*/
                    compararNumeros();
                    break;
                case 2:
                    double a = 2;
                    double b = 3;
                    double c = 1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }

    //REFACT4
    public static void imprimirDetallesProducto(Product producto) {
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Descripción: " + producto.getDescripcion());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad en stock: " + producto.getCantidadEnStock());
    }
    //REFACT4: Aquí vemos el método compararNumeros.
    public static void compararNumeros() {
        System.out.println("intro: ");
        int num1 = scan.nextInt();
        System.out.println("intro: ");
        int num2 = scan.nextInt();
        if (max(num1,num2)) {
            System.out.println("aaa");
        } else {
            System.out.println("bbb");
        }
    }
}