import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Ivo", "Ivic");
        osoba1.pozdrav();

        Student student1 = new Student("Marko", "Maric", "12345");
        student1.pozdrav();

        Profesor profesor1 = new Profesor("Pero", "Peric", "OOP");
        profesor1.pozdrav();


        /*
        Item item1 = new Item("item1", "123", 2);
        System.out.println(item1.getPrice(5));
        System.out.println(item1);
        System.out.println(item1.getItemType());

        Food food1 = new Food("food1", "456", 2, 200, LocalDate.of(2024, 8, 31));
        System.out.println(food1.getPrice(5));
        System.out.println(food1);
        System.out.println(food1.getItemType());
        System.out.println(Item.getVAT() + "___" + Food.getVAT());*/
    }
}