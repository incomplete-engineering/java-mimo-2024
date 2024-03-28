package s4;

import java.util.ArrayList;
import java.util.List;

import s4.model.Book;
import s4.model.Equipment;
import s4.model.Magazine;
import s4.model.Pen;
import s4.model.Product;

public class P03Lists {
    public static void main(String[] args) {
        List<Product> products = getStock();
        //Grace aux interfaces, on peut afficher le stock, sans traiter séparément les livres, les fournitures, etc..
        for (Product product : products) {
            System.out.println("- " + product.getTitle() + ". Prix: " + product.getPrice() + ". " + product.getDescription());
        }
        

    }


    public static List<Product> getStock() {

        Book oldCuriosity = new Book();
        oldCuriosity.setTitle("The Old Curiosity Shop");
        oldCuriosity.setAuthorName("Charles Dickens");
        oldCuriosity.setDescription("It was so popular that New York readers stormed the wharf when the ship bearing the final instalment arrived in 1841");
        oldCuriosity.setIsbn("9780140437423");
        oldCuriosity.setNbrPages(608);
        oldCuriosity.setPrice(11.18);

        Magazine lrb = new Magazine();
        lrb.setTitle("London Review of Books");
        lrb.setPrice(200);
        lrb.setDescription("British literary magazine published bimonthly that features articles and essays on fiction and non-fiction subjects, which are usually structured as book reviews");
        lrb.setIssn("0260-9592");
        lrb.setCirculation(74_743);


        Equipment carnet = new Equipment();
        carnet.setTitle("Jolis Papiers | Carnet de notes");
        carnet.setPrice(9.90);
        carnet.setDescription("Carnet de notes contenant 184 pages blanches lignées pour toutes vos notes, listes, pensées, et bien plus");

        Pen p = new Pen();
        p.setPrice(1.5);

        //List est une interface, qui est implémentée par différentes classes dans java.
        //l'implémentation la plus connue est: ArrayList:
        List<Product> stock = new ArrayList<>();
        stock.add(oldCuriosity);
        stock.add(lrb);
        stock.add(carnet);  

        return stock;
    }
}
