package cs520.hw6;

public class ResultsEntry {
    private int count;
    private char target;

    public ResultsEntry(int count, char target){
        this.count = count;
        this.target = target;
    }

    public String toString(){
        return "<"+Character.toString(target)+", "+this.count+">";
    }



    public int getCount() {
        return count;
    }

    public char getTarget() {
        return target;
    }
}
