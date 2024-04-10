public class Osoba {
    private String ime;
    private String prezime;
    private String JMBG;

    public Osoba(){
        this.ime = "Default name";
        this.prezime = "Default surname";
        this.JMBG = "Default JMBG";
    }

    public Osoba(String ime, String prezime, String JMBG){
        this.ime = ime;
        this.prezime = prezime;
        this.JMBG = JMBG;
    }

    public String getIme(){
        return this.ime;
    }
    public String getPrezime(){
        return this.prezime;
    }
    public String getJMBG(){
        return this.JMBG;
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    public void setPrezime(String prezime){
        this.prezime = prezime;
    }
    public void setJMBG(String JMBG){
        this.JMBG = JMBG;
    }

    @Override
    public String toString(){
        return this.ime + " " + this.prezime + " " + this.JMBG;
    }
}
