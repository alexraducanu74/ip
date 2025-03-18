class Cursa {
    String start;
    String end;
    boolean luata;

    public String getPretFinal() {
        // Implementation here
        return "Pret calculat";
    }

    public Cursa(String start, String end) {
        this.start = start;
        this.end = end;
        this.luata = false;
    }

    public boolean eLuata(){
        return luata;
    }

    void setLuata() {
        this.luata=true;
    }
}