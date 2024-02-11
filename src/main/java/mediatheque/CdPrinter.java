package mediatheque;

public class CdPrinter implements ItemVisitor{
    public CdPrinter(){
    }

    public void visit (CD c){
        c.print();
    }

    @Override
    public void visit(Book b) {
        // Do nothing if the item is a book
    }
}
