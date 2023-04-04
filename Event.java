//Event.java----by Aaron Guzman----4/1/2022
import java.util.Random;
public class Event
{
    //comment
    //instance variables


    private Inventory inv;
    private Party party;


    public Event(Inventory inv, Party party)
    {
        this.inv = inv;
        this.party = party;
    }




    public void randomEvents()
    {
        // create a random integer generator from 0 to 99
        Random rand = new Random();


        int rand_int1 = rand.nextInt(100);


        // Print random integers
        //System.out.println("Random Integer: "+rand_int1);


        //berrybush
        if (rand_int1 ==  0 || rand_int1 == 1){
            System.out.println("You found a berry bush. Plus 20 pounds of food.");
            inv.setFoodCount(20);
            System.out.println("Food Count: " + inv.getFoodCount());
        }


        //raiderAttacck
        if (rand_int1 ==  2 || rand_int1 == 3){
            System.out.println("You have been attacked by raiders.\n" + "Minus 50 bullets.\n" + "Minus $100.\n" + "Minus 2 clothing.");
            inv.setBulletsCount(-50);
            if(inv.getBulletsCount() < 0)
            {
                inv.setBulletsCount(-1*inv.getBulletsCount());
            }
            System.out.println("Bullet Count: " + inv.getBulletsCount());
            inv.setPlayerMoneyCount(-100);
            if(inv.getPlayerMoneyCount() < 0)
            {
                inv.setPlayerMoneyCount(-1*inv.getPlayerMoneyCount());
            }
            System.out.println("Player Money Count: " + inv.getPlayerMoneyCount());
            inv.setClothingCount(-2);
            if(inv.getClothingCount() < 0)
            {
                inv.setClothingCount(-1*inv.getClothingCount());
            }
            System.out.println("Clothing Count: " + inv.getClothingCount());
        }


        //Animal Attack
        if (rand_int1 ==  4){
            Random rand1 = new Random();
            int player[] = new int [5];
            int playerTemp = 0;
            playerTemp = rand1.nextInt(5);


            System.out.println("Animal attack. Minus 2 medical supplies.");
            if(inv.getMedicalSupplyCount() > 2)
            {
                inv.setMedicalSupplyCount(-2);
            }
            else
            {
                player = party.getHealth();
                player[playerTemp] = player[playerTemp] - 10;
                party.setHealth(player);
            }
            System.out.println("Medical supply count: " + inv.getMedicalSupplyCount());
        }


        //Member Sickness
        if (rand_int1 ==  5 || rand_int1 == 6){
            Random rand2 = new Random();
            int player1[] = new int [5];
            int playerTemp1 = 0;
            playerTemp1 = rand2.nextInt(5);
            System.out.println("A member of your group has the flu. Minus 2 medical supplies.");
            if(inv.getMedicalSupplyCount() > 2)
            {
                inv.setMedicalSupplyCount(-2);
            }
            else
            {
                player1 = party.getHealth();
                player1[playerTemp1] = player1[playerTemp1] - 10;
                party.setHealth(player1);
            }
            System.out.println("Medical supply count: " + inv.getMedicalSupplyCount());
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
            inv.setOxenCount(-1);
            System.out.println("Medical supply count: " + inv.getOxenCount());
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
            Random rand3 = new Random();
            int player2[] = new int [5];
            int playerTemp2 = 0;
            playerTemp2 = rand3.nextInt(5);


            System.out.println("A member of your family got bit by a snake. Minus 2 Medical Supply");
            if(inv.getMedicalSupplyCount() > 2)
            {
                inv.setMedicalSupplyCount(-2);
            }
            else
            {
                player2 = party.getHealth();
                player2[playerTemp2] = player2[playerTemp2] - 10;
                party.setHealth(player2);
            }
            System.out.println("Medical supply count: " + inv.getMedicalSupplyCount());
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


        //Broken Wheel
        if (rand_int1 ==  21 || rand_int1 == 22){
            System.out.println("You have a broken wheel. Minus 1 wheels.");
            inv.setWagonWheelCount(1);
            System.out.println("Wheel Count: " + inv.getWagonWheelCount());
        }


        //Broken Axle
        if (rand_int1 ==  23 || rand_int1 == 24){
            System.out.println("You have a broken Axle. Minus 1 axle.");
            inv.setWagonAxleCount(1);
            System.out.println("Axle Count: " + inv.getWagonAxleCount());
        }


        //Broken Tongue
        if (rand_int1 ==  25){
            System.out.println("You have a broken tongue. Minus 1 tongue.");
            inv.setWagonTongueCount(1);
            System.out.println("Tongue Count: " + inv.getWagonTongueCount());
        }
    }
}
