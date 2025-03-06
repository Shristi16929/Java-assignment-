 class Book{
    String book_name,ISBN;
    double price;
    void readBook(String name,String isbn, double p){
        book_name=name;
        ISBN=isbn;
        price=p;
    }
    void displayBook(){
        System.out.println("Book: " +book_name+ ", ISBN: " +ISBN+ ", Price:" +price);
    }
    public static void main(String args[]){
        Book book=new Book();
        book.readBook("Java Programming","12345", 499.99);
        book.displayBook();
    }
}