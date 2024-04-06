class Predmet {
    private String imePredmeta;
    private int ocjena;

    public Predmet(String imePredmeta, int ocjena) {
        this.imePredmeta = imePredmeta;
        this.ocjena = ocjena;
    }

    public String getIme() {
        return imePredmeta;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setIme(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }
}