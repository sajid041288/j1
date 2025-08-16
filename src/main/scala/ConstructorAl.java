class Book {
    String title;
    int pages;
    String author;
    int version;
    String bookname;


    Book() {
        this.title = "";
        this.pages = 0;
        this.author = "";
        this.version = 0;
        this.bookname = "";
    }

    Book(String title, int pages, String author, int version, String bookname) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.version = version;
        this.bookname = bookname;
    }

    Book(Book b2) {
        this.title = b2.title;
        this.pages = b2.pages;
        this.author = b2.author;
        this.version = b2.version;
        this.bookname = b2.bookname;
    }


    public static void main(String[] args) {
        Book b1 = new Book();
        b1.bookname = "Hi";
        b1.pages = 400;
        b1.author ="sajid";
        b1.version=1;
        Book b3= new Book(b1);

    }
}
