package do_you_feel_lucky;

import java.util.*;

public class Player {

    private HashSet<Leaflet> pocket = new HashSet<Leaflet>();
    private String afm;
    private String iban;
    private String firstName;
    private String lastName;
    private Scanner sc = new Scanner(System.in);

    public void createPlayer() {//Creates a new player with all required information
        System.out.println("\nEnter your afm:");
        afm = sc.next();
        System.out.println("\nEnter your iban:");
        iban = sc.next();
        System.out.println("\nEnter your first name:");
        firstName = sc.next();
        System.out.println("\nEnter your last name:");
        lastName = sc.next();
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Leaflet playingJoker(Leaflet goodluck) {

        goodluck.getNumbers();
        goodluck.getJoker();
        pocket.add(goodluck);
        return goodluck;
    }

    public HashSet<Leaflet> getPocket() {
        return pocket;
    }

    public void setPocket(HashSet<Leaflet> pocket) {
        this.pocket = pocket;
    }
}
