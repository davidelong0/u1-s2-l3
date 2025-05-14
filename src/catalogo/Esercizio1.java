package catalogo;

import java.util.List;

public class Esercizio1 {
    public static void main(String[] args) {
        Product p1 = new Product(135423L, "Mario", "Books", 101.0);
        Product p2 = new Product(135425L, "Marco", "pens", 3.50);
        Product p3 = new Product(135434L, "Mattia", "Books", 3.50);
        Product p4 = new Product(135423L, "Mino", "Books", 150.0);
        Product p5 = new Product(135425L, "Marika", "pens", 3.50);
        Product p6 = new Product(135434L, "Sofia", "Books", 3.50);
        ;
        List<Product> products =  List.of(p1,p2,p3,p4,p5,p6);

        System.out.println("I prodotti della categoria 'Books' con prezzo maggiore di 100 sono:");
        products.stream()
                .filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100)
                .forEach(System.out::println);

    }
}
