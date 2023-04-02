package seminar.seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ThirdTask {
    static ArrayList<String> planets = new ArrayList<>();

    public void addPlanets() {
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Уран");
        planets.add("Сатурн");
        planets.add("Нептун");
        planets.add("Земля");

        System.out.println(planets);
        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            if (Collections.frequency(planets, iterator.next()) > 1) {
                iterator.remove();
            }
        }
        System.out.println(planets);
    }
}
