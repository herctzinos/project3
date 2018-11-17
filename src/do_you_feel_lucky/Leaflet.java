package do_you_feel_lucky;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;

public class Leaflet {

    private int id;
    static int i;
    private String timedate;

    public String getTimedate() {
        return timedate;
    }

    public void setTimedate(String timedate) {
        this.timedate = timedate;
    }

    HashSet<Integer> numbers = new HashSet<Integer>();
    HashSet<Integer> joker = new HashSet<Integer>();
    Scanner sc = new Scanner(System.in);

    public HashSet number_norm(HashSet a) {//Checks player inputs
        System.out.println("\nHow many numbers you wish to play?");
        int i = sc.nextInt();
        while (i < 5 || i > 45) {
            System.out.println("Invalid option, try again.");
            i = sc.nextInt();
        }
        System.out.println("Please enter " + i + " unique numbers from 1 to 45");
        while (a.size() < i) {
            int num = sc.nextInt();
            if (num < 1 || num > 45) {
                System.out.println("not valid");
            } else {
                a.add(num);
                System.out.println("Checked!");
                System.out.println(a);
            }
        }
        return a;
    }

    public HashSet joker_norm(HashSet z) {//Checks player inputs regarding joker number
        System.out.println("\nHow many joker numbers you wish to play?");
        int j = sc.nextInt();
        while (j < 1 || j > 20) {
            System.out.println("Invalid option, try again.");
            j = sc.nextInt();
        }
        System.out.println("Please enter " + j + " unique numbers from 1 to 20");
        while (z.size() < j) {
            int jok = sc.nextInt();
            if (jok < 1 || jok > 20) {
                System.out.println("not valid");
            } else {
                z.add(jok);
                System.out.println("Checked!");
                System.out.println(z);
            }
        }
        return z;
    }

    public void Leaflet() {//Creates Leaflet with its corresponding attributes
        IDleaflet generator = new IDleaflet();
        timedate = new SimpleDateFormat("yyyy/MM/dd HH.mm.ss").format(new Date());
        this.id = generator.getId();
        number_norm(numbers);
        joker_norm(joker);
        System.out.println("\nDeltio created with ID number " + id + " and timestamp " + timedate);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashSet<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(HashSet<Integer> numbers) {
        this.numbers = numbers;
    }

    public HashSet<Integer> getJoker() {
        return joker;
    }

    public void setJoker(HashSet<Integer> joker) {
        this.joker = joker;
    }
}
