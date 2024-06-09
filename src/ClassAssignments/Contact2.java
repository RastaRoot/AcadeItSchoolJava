package ClassAssignments;

public class Contact2 {
    public static void main(String[] args) {
        Contact contact = new Contact("Zvyagin", "Evgeny", "8951180688");
        contact.print();

        contact.setFirstName("Женя");

        System.out.println("Имя " + contact.getFirstName());
    }
}

