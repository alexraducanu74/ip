
class Sofer extends User {
    String codSofer;
    int numarCursePreluate;
    boolean luat;

    public Sofer() {
        this.luat = false;
    }

    public int getCursePreluate() {
        return numarCursePreluate;
    }

    public boolean eLuat(){
        return luat;
    }
    public void setLuat(){
        this.luat = true;
    }
}