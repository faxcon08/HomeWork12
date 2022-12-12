public class Book {
    private String bookName = "Default Book Name";
    private final Author author;
    private int publishingYear;

    public Book(String bookName,Author author, int publishingYear) {

        if (Author.checkString(bookName,"Неверное название книги")) {
            this.bookName=bookName.trim();
        }

        this.author = author;

        if (publishingYear>=1445) {
            this.publishingYear = publishingYear;
        } else {
            System.out.println("Некорректный год издания");
            this.publishingYear = 2000;
        }

    }// book()
    public void setPublishingYear(int year) {
        if(year>=1445)
            this.publishingYear=year;
        else
            System.out.println("Попытка изменить год изадания на некорректный год");
    } // setPublishigYear

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author.getFullName();
    }
    public String toString() {
//        return "Книга: "+this.bookName+"  Автор: "+this.author+" год выпуска - "+this.publishingYear;
        return String.format("Книга: %30s Автор: %15s год выпуска - %4d г.",this.bookName,this.author,this.publishingYear);
    }// toString
}
