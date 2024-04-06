import java.util.ArrayList;

class Student {
    private String ime;
    private String prezime;
    private int brojIndeksa;
    private ArrayList<Predmet> predmeti;

    private static int brojStudenata = 0;

    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.predmeti = new ArrayList<>();
        brojStudenata++;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public static int getBrojStudenata() {
        return brojStudenata;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
    }

    public double prosjek() {
        if (predmeti.isEmpty()) {
            return 0;
        }
        double sumaOcjena = 0;
        for (Predmet predmet : predmeti) {
            sumaOcjena += predmet.getOcjena();
        }
        return sumaOcjena / predmeti.size();
    }

    @Override
    public String toString() {
        return "Student " + ime + " " + prezime + " ima prosjek " + prosjek();
    }
}
