public class Main {
    public static void main(String[] args) {
        System.out.println("Object Methods");
        System.out.println("level easy");
        Author stepenKing = new Author("Stephen", "King");
        Author stepenKing2 = new Author("Stephen", "King");
        System.out.println(stepenKing2.equals(stepenKing));
        Book firstBook = new Book("Desperation", stepenKing, 1997);
        System.out.println(firstBook.getBookName() + " " + firstBook.getPublishYear() + " " + firstBook.getAuthor().getName() + " " + firstBook.getAuthor().getSurName());
        System.out.println(firstBook);
        Book secondBook = new Book("5 love languages", new Author ( "Harry", "Chepman"), 1992);
        firstBook.setPublishYear(2020);
        System.out.println(firstBook.getPublishYear());

        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author harryChepman = new Author("Harry", "Chepman");
        System.out.println("Author copies equals: " + stepenKing.equals(stepenKing2));
        System.out.println("uthor copies equals by hachCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Author equals: " + stephenKing.equals(harryChepman));
        System.out.println("Author equals by hachCode: " + (stephenKing.hashCode() == harryChepman.hashCode()));

        System.out.println(stepenKing);
        System.out.println(harryChepman);
        System.out.println("+++++++++++++++");
    }
}