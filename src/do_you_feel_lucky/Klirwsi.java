package do_you_feel_lucky;

import java.util.HashSet;
import java.util.Random;

public class Klirwsi {

    private HashSet<Integer> winning5ada = new HashSet<Integer>();
    private int winningjoker;

    public HashSet<Integer> getWinning5ada() {
        return winning5ada;
    }

    public int getWinningJoker() {
        return winningjoker;
    }

    public Klirwsi() { //Generate 5 random numbers and 1 random joker number
        int n1 = 5;
        int max1 = 45;
        Random r1 = new Random();

        while (winning5ada.size() < n1) {
            int i = r1.nextInt(max1 + 1);
            if (i == 0) {
                continue;
            }
            winning5ada.add(i);
        }

        Random r2 = new Random();
        winningjoker = r2.nextInt(20) + 1;
    }

    public static void diditwin(HashSet<Leaflet> d, Klirwsi k) {// Checks if leaflet wins based on given conditions

        for (Leaflet deltio : d) {

            HashSet<Integer> pentada = deltio.getNumbers();
            HashSet<Integer> jokers = deltio.getJoker();
            HashSet<Integer> klirosi_pentada = k.getWinning5ada();
            boolean jokers_result;

            pentada.retainAll(klirosi_pentada);
            jokers_result = jokers.contains(k.getWinningJoker());

            System.out.println("The five lucky numbers are: " + klirosi_pentada + " and the joker is number " + k.getWinningJoker());

            if (((pentada.size() == 5) && (jokers_result)) || (pentada.size() == 4)) {
                System.out.println("Leaflet with id number " + deltio.getId() + " played at " + deltio.getTimedate() + " wins!!!");
            } else {
                System.out.println("No win for leaflet with id number " + deltio.getId() + " played at " + deltio.getTimedate() + ", better luck next time.");
            }
        }
    }
}
