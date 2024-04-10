public class Program {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Ivo", "Ivic", "1234444");

        System.out.println(osoba1);
        System.out.println(osoba2);
        promijeniJMBG(osoba2, "12345");
        System.out.println(osoba2);

        Kvadrat k1 = new Kvadrat(5);

        System.out.println("Površina kvadrata je" + k1.povrsina() + ",a opseg je" + k1.opseg());
    }

    public static Osoba promijeniJMBG(Osoba osoba, String JMBG){
        osoba.setJMBG(JMBG);
        return osoba;
    }
}
