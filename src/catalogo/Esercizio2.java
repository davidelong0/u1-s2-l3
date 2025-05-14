package catalogo;

import java.util.List;
import java.time.LocalDate;
import java.util.stream.Stream;


public class Esercizio2 {
    public static void main(String[] args) {
        Product p1 = new Product(1L, "Ciuccio", "Baby", 15.0);
        Product p2 = new Product(2L, "Tuta", "Baby", 30.0);
        List<Product> listaProdotti = List.of(p1, p2);
        Customer cliente = new Customer(1L, "Luca", 2);
        LocalDate ordineData = LocalDate.of(2021, 3, 15);      // 15 marzo 2021
        LocalDate consegnaData = LocalDate.of(2021, 3, 20);    // 20 marzo 2021

        Order o1 = new Order(135423L, "Spedito", ordineData, consegnaData, listaProdotti, cliente);
        Order o2 = new Order(135424L, "In attesa", ordineData, consegnaData, listaProdotti, cliente);
        Order o3 = new Order(135425L, "Consegnato", ordineData, consegnaData, listaProdotti, cliente);
        List<Order> orders = List.of(o1, o2, o3);

        System.out.println("gli ordini che contengono baby sono:");
        orders.stream()
                .filter(order ->
                        order.getProducts().stream()
                                .anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby"))
                )
                .forEach(System.out::println);

    }
}
