package contactApp;

public class Main {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Alice", "123-456-7890", "01-01-1990");
        Contact contact2 = new Contact("Bob", "234-567-8901", "02-02-1992");
        Contact contact3 = new Contact("Charlie", "345-678-9012", "03-03-1993");
        Contact contact4 = new Contact("David", "456-789-0123", "04-04-1994");

        Contact copyContact1 = new Contact(contact1);
        Contact copyContact2 = new Contact(contact3);

        contact1.setBirthDate("01-01-1989");

    }
}
