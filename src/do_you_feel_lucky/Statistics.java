package do_you_feel_lucky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Statistics {

    public void max() {//Finds elements with most occurences based on given conditions
        ArrayList<Integer> x = new ArrayList();

        int max_times;
        for (max_times = 0; max_times < 20; max_times++) {
            Klirwsi kl = new Klirwsi();
            Iterator<Integer> itr = kl.getWinning5ada().iterator();
            while (itr.hasNext()) {
                x.add(itr.next());
            }
        }
        int count = 0;
        HashMap<Integer, Integer> counters1 = new HashMap<Integer, Integer>();

        while (count < 3) {

            int maxKey = -1;
            int maxValue = -1;

            for (int z = 0; z < x.size(); z++) {
                if (!counters1.containsKey(x.get(z))) {
                    counters1.put(x.get(z), 1);
                } else {
                    counters1.put(x.get(z), counters1.get(x.get(z)) + 1);
                }
            }
            for (HashMap.Entry<Integer, Integer> entry : counters1.entrySet()) {
                if (entry.getValue() >= maxValue) {
                    maxKey = entry.getKey();
                    maxValue = entry.getValue();
                }
            }

            System.out.println("Number " + maxKey + " was picked " + maxValue + " times from a total of " + max_times + " draws.");
            counters1.clear();
            count++;

            for (Iterator<Integer> i = x.iterator(); i.hasNext();) {
                Integer number = i.next();
                if (Objects.equals(number, maxKey)) {
                    i.remove();
                }
            }
        }
    }

    public void min() {//Finds element with least occurences based on given conditions
        ArrayList<Integer> y = new ArrayList();

        int min_times;
        for (min_times = 0; min_times < 20; min_times++) {
            Klirwsi kl = new Klirwsi();
            Iterator<Integer> itr = kl.getWinning5ada().iterator();
            while (itr.hasNext()) {
                y.add(itr.next());
            }
        }
        int count = 0;
        HashMap<Integer, Integer> counters2 = new HashMap<Integer, Integer>();

        while (count < 3) {

            int minKey = 46;
            int minValue = min_times;

            for (int z = 0; z < y.size(); z++) {
                if (!counters2.containsKey(y.get(z))) {
                    counters2.put(y.get(z), 1);
                } else {
                    counters2.put(y.get(z), counters2.get(y.get(z)) + 1);
                }
            }

            for (HashMap.Entry<Integer, Integer> entry : counters2.entrySet()) {
                if (entry.getValue() < minValue) {
                    minKey = entry.getKey();
                    minValue = entry.getValue();
                }
            }
            System.out.println("Number " + minKey + " was picked " + minValue + " times from a total of " + min_times + " draws.");
            counters2.clear();
            count++;

            for (Iterator<Integer> i = y.iterator(); i.hasNext();) {
                Integer number = i.next();
                if (Objects.equals(number, minKey)) {
                    i.remove();
                }
            }
        }
    }
}
