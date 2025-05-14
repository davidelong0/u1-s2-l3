package catalogo;

import java.util.List;
import java.util.stream.Collectors;

public class Esercizio3 {
    public static void main(String[] args) {
        Product p1 = new Product(1L, "Pallone", "Boys", 30.0);
        Product p2 = new Product(2L, "Maglietta", "Boys", 25.0);
        Product p3 = new Product(3L, "Libro", "Books", 15.0);
        Product p4 = new Product(4L, "Macchinina", "Boys", 40.0);

        List<Product> listaProdotti = List.of(p1, p2, p3, p4);

        List<Product> prodottiScontati = listaProdotti.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase("Boys"))
                .map(product -> new Product(
                        product.getId(),
                        product.getName(),
                        product.getCategory(),
                        product.getPrice() * 0.9 // applico sconto 10%
                ))
                .collect(Collectors.toList());

        prodottiScontati.forEach(System.out::println);
    }
}
