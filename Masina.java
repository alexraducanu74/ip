public class Masina {
    private String producator;
    private String anProductie;
    private String nrInatriculare;

    public Masina(String producator, String anProductie, String nrInatriculare) {
        this.producator = producator;
        this.anProductie = anProductie;
        this.nrInatriculare = nrInatriculare;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setAnProductie(String anProductie) {
        this.anProductie = anProductie;
    }

    public void setNrInatriculare(String nrInatriculare) {
        this.nrInatriculare = nrInatriculare;
    }

    public String getProducator() {
        return producator;
    }

    public String getAnProductie() {
        return anProductie;
    }

    public String getNr() {
        return nrInatriculare;
    }
}
