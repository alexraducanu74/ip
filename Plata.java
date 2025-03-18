public class Plata {
    private String metodaDePlata;
    private int pret;
    private int discountProcent;

    public Plata(String metodaDePlata, int pret, int discountProcent) {
        this.metodaDePlata = metodaDePlata;
        this.pret = pret;
        this.discountProcent = discountProcent;
    }

    public String getMetodaDePlata() {
        return metodaDePlata;
    }

    public void setMetodaDePlata(String metodaDePlata) {
        this.metodaDePlata = metodaDePlata;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getDiscountProcent() {
        return discountProcent;
    }

    public void setDiscountProcent(int discountProcent) {
        this.discountProcent = discountProcent;
    }

    public void procesarePlata() {
        double pretTotal;
        pretTotal= (double) pret - (double) discountProcent/100*pret;
        System.out.println("Am efectuat plata in valoare de " + pretTotal + " folosing metoda de plata " + metodaDePlata);
    }
}
