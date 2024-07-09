package cs520.hw6;

import java.util.ArrayList;
import java.util.Collection;

public class SharedResults {
    private Collection<ResultsEntry> results = null;

    public SharedResults(){
        this.results = new ArrayList<>();
    }

    public synchronized void addToResults(ResultsEntry e){
        results.add(e);
        System.out.println(Thread.currentThread().getName() + " is adding "+ e.toString()+", Cumulative Results are "+ results.toString());
    }

    public synchronized int getResult(){
        int characterCount=0;
        for (ResultsEntry r : results){
             characterCount+= r.getCount();
        }
        return characterCount;
    }


}
