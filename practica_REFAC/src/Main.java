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

    //REFACT 6: Hacemos un inline code, reduciendo bastante el código ya que lo otro era redundante
    public static boolean max(int a, int b) {
        /*if (a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
         */
        return a > b; // REFACT 6: AL final lo reducimos a esto, si a es mayor que b devolverá a true, si no devolverá false,
    }

    public static void calcEquacioSegongrau(double a, double b, double c) {
        //double D = b * b - 4 * a * c; //REFACT 12: Ponerle un nombre que se entienda
        double descriminante = b * b - 4 * a * c;
        if (descriminante > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(descriminante)) / (2 * a);
            x2 = (-b + Math.sqrt(descriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (descriminante == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("Equation has no roots");
        }
    }

    //REFACT8: Extracción de clase, ya que veo bastante logica separar Human y dejar el main más limpio
    /*
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
     */
    //REFACT5: Extracción de clase. Pongo el metodo Order y calculateToTalPrice en una clase llamada Order.
    /*
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
*///REFACT 10: Extracción de clase al igual que la extracción que hicimos de Order.
    /*
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

     */
    // REFACT 9: Extracción de clase por el mismo mótivo que el REFACT8 (Human).
   /*
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

    */

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
            System.out.print("\nElije qué quieres hacer: ");

            opcio = scan.nextInt();
            scan.nextLine();
            System.out.println();
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

    //REFACT4: Aquí vemos el método compararNumeros.
    public static void compararNumeros() {
        //REFACT7: Es mejor incicializar las variables al inicio.
        //REFACT8: También inicializamos una nueva variable llamada solución y la usaremos
        int num1, num2;
        String solucion;
        System.out.print("intro: ");
        //int num1 = scan.nextInt();
        //REFACT7: Ponemos las variables que hemos incializado anteriormente.
        num1 = scan.nextInt();
        System.out.print("intro: ");
        //int num2 = scan.nextInt();
        num2 = scan.nextInt(); //REFACT 7
        //REFACT 8: Hacemos el código más legible
        /*
        if (max(num1,num2)) {
            System.out.println("aaa");
        } else {
            System.out.println("bbb");
        }
    }
         */
        if (max(num1, num2)) {
            solucion =num1 + " es más grande que " + num2 + "\n"; //REFACT7 usamos la variable string para poner la respuesta

        } else {
            solucion = num1 + " no es más grande que " + num2 + "\n"; //REFACT7 No pongo num2 es más grande que num1, ya que puede ser más grande o igual
            //Por lo tanto es más correcto poner que num1 no es más grande que num2.
        }
        System.out.println(solucion);
    }
}