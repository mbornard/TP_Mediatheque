package mediatheque;

public  class BookPrinter implements ItemVisitor{
    public BookPrinter(){
    }

    public void visit (Book b){
        b.print();
    }

    @Override
    public void visit(CD c) {
        // Do nothing if the item is a CD
    }
}
