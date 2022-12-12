public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void printRedLN(String str) {
        System.out.println(ANSI_RED+str+ANSI_RESET);
    }
    public static void myDelimiter() {
        printRedLN("----------------------------------------------------");
    }
    public static void main(String[] args) {
        Author firstAuthor = new Author("  Лев    Толстой  ");
        Author secondAuthor = new Author("  Деннис  "," Ричи  ");

        Book firstBook = new Book("    Война и Мир", firstAuthor, 1997);
        Book secondBook = new Book("    Язык программирования Си   ", secondAuthor, 2001);

        myDelimiter();
        System.out.println(firstBook);
        System.out.println(secondBook);

        secondBook.setPublishingYear(2012);

        printRedLN("После изменения года выпуска");
        System.out.println(secondBook);
        myDelimiter();
    }
}