/**
 * Programming 2 Oregon Trail Project
 * @author The Busy People
 * @since March 28, 2023
 *
 * Description: The Main class organizes the pre-loop methods and also contains the main loop of the game which is interated
 * after each day on the Oregon Trail.
 */

public class Main {
    public static void main(String[] args) {
        //Program creates objects
        Inventory inv = new Inventory();
        Shop shop = new Shop(inv, inv.getPlayerMoneyCount());
        Map map = new Map();
        Party party = new Party(inv);
        Menu menu = new Menu(inv, party, map, shop);
        Event event = new Event(inv, party);
        Date date = new Date(menu.startDate());


        //Programs Goes through title screen and main menu items.
        menu.titleScreen();

        //Outputs the history of the trail.
        menu.introAboutTrail();

        // Loads the menu of all choices the player has before the game.
        menu.loadMainMenu();

        // Player is able to set Hattie's family members/pet names.
        menu.setNames();

        //Display blurb about starting cash, what they could buy, and what they should buy.  (maybe add lore here based on class)
        menu.initialCash(inv.getPlayerMoneyCount());
        shop.buyItems();
        //Display graphic for "Beginning the journey"
        inv.isWagonUsable();


        //Game Loop
        //increment date
        //increment weather / terrain if needed
        //increment distance to oregon                      (DONE)
        //increment distance to next location               (Done)
        //remove food                                       (Done)
        //update health                                      (Done)
        //roll for random event
        //complete random event if encountered
        //Offer options
        //trail trade
        //trail talk
        //trail continue
        //change rations
        //change speed
        //
        //Exit gameplay loop and return to main menu



        while((map.getPosition() <  250) && !party.getGameOverStatus())
        {
            map.progressBar();

            date.setDate(1); // should increment the date, not working
            date.printDate(); // prints out the current date

            // prints out the players health
            party.printAllPeoplesHealth();

            // increment weather / terrian if needed
            map.setClimateZone();
            date.setWeather(map.getClimate());
            date.setTemp(map.getClimate());
            date.setGrass(map.getClimate());

            // calculates the players food use
            party.dailyFoodUsed();
            event.randomEvents();

            int temp = 1;

            do
            {
                temp = menu.playerDailyChoices();

            }while(temp == 2);




            // 10 miles travelled per day
            if(inv.isWagonUsable() && !party.getGameOverStatus())
            {
                map.setPosition(10);
            };

            // increment distance to next location
            map.getDistToLM();

            System.out.println("[========================================================================]");
        }

        if (map.getPosition() >= 250 && !party.getGameOverStatus())
        {
            System.out.println("YOU HAVE MADE IT TO THE FIRST FORT!!!");
            System.out.println("[========================================================================]");
        }
        else
        {
            System.out.println("YOU HAVE DIED AND DID NOT MAKE IT TO OREGON CITY!!!");
            System.out.println("[========================================================================]");
        }



    }
}