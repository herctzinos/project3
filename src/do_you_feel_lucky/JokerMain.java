package do_you_feel_lucky;

import java.util.Scanner;

public class JokerMain {

    static Player p1 = new Player();

    public static void main(String args[]) {
        Statistics stats = new Statistics();
        stats.max();
        stats.min();
        Scanner sc = new Scanner(System.in);
        p1.createPlayer();
        boolean flag = true;
        while (flag) {
            Leaflet leaf = new Leaflet();
            leaf.Leaflet();

            p1.playingJoker(leaf);
            System.out.println("\nCreate another leaflet?");
            if (sc.next().equals("yes")) {
                flag = true;
            } else {
                flag = false;
            }
        }
        Klirwsi l = new Klirwsi();
        Klirwsi.diditwin(p1.getPocket(), l);
    }
}
