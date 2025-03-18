import java.util.List;
import java.util.ArrayList;
public class RideSharing {
    List<Administrator> administratori;
    List<Client> clienti;
    List<Sofer> soferi;
    List<Masina> masini;
    List<Cursa> curse;
    List<Plata> plati;
    List<Autoritate> autoritati;

    public RideSharing() {
        this.administratori = new ArrayList<>();
        this.clienti = new ArrayList<>();
        this.soferi = new ArrayList<>();
        this.masini = new ArrayList<>();
        this.curse = new ArrayList<>();
        this.plati = new ArrayList<>();
        this.autoritati = new ArrayList<>();
    }

    public void asociazaCurseLaSoferi(){
        for ( Sofer sofer : soferi)
            for ( Cursa cursa : curse)
                if (!sofer.eLuat() && !cursa.eLuata()) {
                    System.out.println(sofer + " are cursa " + cursa);
                    sofer.setLuat();
                    cursa.setLuata();
                }
    }



}
