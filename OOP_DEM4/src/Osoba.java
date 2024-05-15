public class Osoba {

    private String ime;
    private String prezime;

    public String getIme(){
        return this.ime;
    }

    public String getPrezime(){
        return this.prezime;
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    public Osoba(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
    }

    public void pozdrav(){
        System.out.println("Pozdrav, ja sam " + this.ime + " " + this.prezime);
    }
}
