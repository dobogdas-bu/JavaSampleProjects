package cs520.hw5;
import java.util.Random;
// Overwrite this file with your Player.java file from Assignment 4
// and make the changes indicated in the Assignment 5 document.

public class Player {


        private int number;
        private String name;
        private String position;
        private String year;

        public Player(){

        }

        public Player(String name){
            this.name = name;
        }


        public String toString(){
            String player = "#"+ this.number +": "+this.name+" ("+this.position+", "+ this.year+")";
            return player;
        }



        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

    }

