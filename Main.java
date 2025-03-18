
public class Main {
    public static void main(String[] args) {
        RideSharing rs = new RideSharing();

        // Adding Administrators
        Administrator admin1 = new Administrator("312");
        rs.administratori.add(admin1);

        // Adding Clients
        Client client1 = new Client();
        Client client2 = new Client();
        rs.clienti.add(client1);
        rs.clienti.add(client2);

        // Adding Drivers
        Sofer sofer1 = new Sofer();
        Sofer sofer2 = new Sofer();
        rs.soferi.add(sofer1);
        rs.soferi.add(sofer2);

        // Adding Cars
        Masina masina1 = new Masina("1313","1231231","312312");
        Masina masina2 = new Masina("dasfs1313","1fadsaa231231","3123fdas12");
        rs.masini.add(masina1);
        rs.masini.add(masina2);

        // Adding Rides
        Cursa cursa1 = new Cursa("Start A", "End A");
        Cursa cursa2 = new Cursa("Start B", "End B");
        rs.curse.add(cursa1);
        rs.curse.add(cursa2);

        // Adding Payments
        Plata plata1 = new Plata("fasds",10,200);
        Plata plata2 = new Plata("abc",3231,312);
        rs.plati.add(plata1);
        rs.plati.add(plata2);

        // Adding Authorities
        Autoritate autoritate1 = new Autoritate();
        rs.autoritati.add(autoritate1);

        rs.administratori.getFirst().manageUser();
    }
}