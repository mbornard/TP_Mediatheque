package mediatheque;

public class Main {
    public static void main(String[] args) {
        Mediatheque mediatheque = new Mediatheque();

        mediatheque.addItem( new Book("J.R.R. Tolkien", "Le seigneur des anneaux"));
        mediatheque.addItem( new Book("Philip K. Dick", "Le Maître du haut chateau"));
        mediatheque.addItem( new Book("JK Rolling", "Harry Potter à l'école des sorcier"));
        mediatheque.addItem( new CD(12, "Sergeant Peppers"));
        mediatheque.addItem( new CD(34, "Les étoiles vagabondes"));

        System.out.println("\n Print all");
        mediatheque.printCatalog();

        System.out.println("\n Print only books");
        mediatheque.printOnlyBooks();

        System.out.println("\n Print only Cds");
        mediatheque.printOnlyCDs();
    }
}
