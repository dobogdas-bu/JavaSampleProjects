package cs520.hw6;

import java.io.BufferedReader;

public class LongTask extends Thread {
    private SharedResults sharedData;
    private StringBuffer inputData;
    private char target;


    public LongTask(SharedResults sharedData, StringBuffer inputData, char target){
        super("Thread_"+ Character.toString(target));
        this.sharedData = sharedData;
        this.inputData = inputData;
        this.target = target;
    }

    public void run(){
        int targetCount=0;
        for(int i =0; i<inputData.length();i++){
            char t = inputData.charAt(i);
            if(target==inputData.charAt(i)){
                targetCount++;
            }
        }

        ResultsEntry resultsEntry = new ResultsEntry(targetCount,target);
        sharedData.addToResults(resultsEntry);
    }


}
