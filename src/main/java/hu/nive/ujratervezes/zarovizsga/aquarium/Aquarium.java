package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> aquarium = new ArrayList<>();

    public void addFish(Fish f){
        aquarium.add(f);
    }

    public void feed(){
        for(Fish item :aquarium){
            item.feed();
        }
    }

    public void removeFish(){
        for (Iterator<Fish> iter = aquarium.iterator(); iter.hasNext();) {
            Fish f = iter.next();
            if (f.getWeight() >= 11) {
                iter.remove();
            }
        }
    }
    public List<String> getStatus() {
        List<String> results = new ArrayList<>();
        for (Fish item : aquarium) {
            results.add(item.status());
        }
        return results;
    }

}



