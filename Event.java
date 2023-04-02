//Event.java----by Aaron Guzman----4/1/2022
import java.util.Random;

public class Event{
//comment
    //instance variables
    private int playerMoneyCount = 1600;
    private static int foodCount = 0;
    private int clothingCount = 0;
    private static int bulletsCount = 0;
    private static int oxenCount = 0;
    private int wagonWheelCount = 4;
    private int wagonAxleCount = 2;
    private int wagonTongueCount = 1;
    private static int medicalSupplyCount = 0;
    private boolean wagonUsable = false;

    public int getPlayerMoneyCount() {
        return playerMoneyCount;
    }

    public void setPlayerMoneyCount(int playerMoneyCount) {
        this.playerMoneyCount = playerMoneyCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getClothingCount() {
        return clothingCount;
    }

    public void setClothingCount(int clothingCount) {
        this.clothingCount = clothingCount;
    }

    public int getBulletsCount() {
        return bulletsCount;
    }

    public void setBulletsCount(int bulletsCount) {
        this.bulletsCount = bulletsCount;
    }

    public int getOxenCount() {
        return oxenCount;
    }

    public void setOxenCount(int oxenCount) {
        this.oxenCount = oxenCount;
    }

    public int getWagonWheelCount() {
        return wagonWheelCount;
    }

    public void setWagonWheelCount(int wagonWheelCount) {
        this.wagonWheelCount = wagonWheelCount;
    }

    public int getWagonAxleCount() {
        return wagonAxleCount;
    }

    public void setWagonAxleCount(int wagonAxleCount) {
        this.wagonAxleCount = wagonAxleCount;
    }

    public int getWagonTongueCount() {
        return wagonTongueCount;
    }

    public void setWagonTongueCount(int wagonTongueCount) {
        this.wagonTongueCount = wagonTongueCount;
    }

    public int getMedicalSupplyCount() {
        return medicalSupplyCount;
    }

    public void setMedicalSupplyCount(int medicalSupplyCount) {
        this.medicalSupplyCount = medicalSupplyCount;
    }

    public boolean isWagonUsable() {
        return wagonUsable;
    }

    public void setWagonUsable(boolean wagonUsable) {
        this.wagonUsable = wagonUsable;
    }

    public static void main(String args[])
    {
        // create a random integer generator from 0 to 99
        Random rand = new Random();

        int rand_int1 = rand.nextInt(100);

        // Print random integers
        //System.out.println("Random Integer: "+rand_int1);    ***********************************************

        //berrybush
        if (rand_int1 ==  0 || rand_int1 == 1){
            System.out.println("You found a berry bush. Plus 20 pounds of food.");
            foodCount = foodCount + 20;
            System.out.println("Food Count: " + foodCount);
        }

        //raiderAttacck
        if (rand_int1 ==  2 || rand_int1 == 3){
            System.out.println("You have been attacked by raiders. Minus 50 bullets.");
            bulletsCount = bulletsCount + 20;
            System.out.println("Food Count: " + bulletsCount);
        }

        //Animal Attack
        if (rand_int1 ==  4){
            System.out.println("Animal attack. Minus 2 medical supply.");
            medicalSupplyCount = medicalSupplyCount - 2;
            System.out.println("Medical supply count: " + medicalSupplyCount);
        }

        //Member Sickness
        if (rand_int1 ==  5 || rand_int1 == 6){
            System.out.println("A member of your group has the flu. Minus 1 medical supply.");
            medicalSupplyCount = medicalSupplyCount - 1;
            System.out.println("Food Count: " + medicalSupplyCount);
        }

        //Meet Other Wagon
        if (rand_int1 ==  7 || rand_int1 == 8){
            System.out.println("You meet another Wagon. Would you like to request to trade?");
        }

        //Blizard; Only in mountains???
        //Heavy Fog;
        //HailStorm

        //Injured Ox
        if (rand_int1 ==  9 || rand_int1 == 10){
            System.out.println("One of your Ox is injured.");
        }

        //Dead Ox
        if (rand_int1 ==  11){
            System.out.println("One of you Ox has died.");
            oxenCount = oxenCount - 1;
            System.out.println("Medical supply count: " + oxenCount);
        }

        //Injured member
        if (rand_int1 == 12){
            System.out.println("A member of your  party is injured.");
        }

        //Lost member; lose a day?
        if (rand_int1 == 13 || rand_int1 == 14){
            System.out.println("A member of your  party is lost.");
        }

        //Snake Bite
        if (rand_int1 == 15){
            System.out.println("A member of your part got bit by a snake. Minus 1 Medical Supply");
            medicalSupplyCount = medicalSupplyCount - 1;
            System.out.println("Food Count: " + medicalSupplyCount);
        }

        //Wrong Trail; lose 4 days
        if (rand_int1 == 16){
            System.out.println("You went down the wrong trail. Lose 4 days.");
        }

        //Rough trail; lose a day
        if (rand_int1 == 17 || rand_int1 == 18){
            System.out.println("Rough Trail. Lose a day.");
        }

        //Impassible trail; lose a day
        if (rand_int1 == 19 || rand_int1 == 20){
            System.out.println("Impassible trail. Lose 3 days.");
        }
    }
}