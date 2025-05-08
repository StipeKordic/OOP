import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    //Student student1 = new Student("Ivo", "Ivic", "R12234");
    //Profesor profesor1 = new Profesor("Pero", "Peric", "programiranje");

    //student1.pozdrav();
    //profesor1.pozdrav();
        Item food1 = new Item("Mlijeko", "12345", 2.0);

        System.out.println(food1.getPrice(5));
    }
}