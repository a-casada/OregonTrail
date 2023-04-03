public class Main {

    public static void main(String[] args) {
        //Program Loads objects
        Menu screen1 = new Menu();
        Inventory inv = new Inventory();
        Shop shop = new Shop(inv, inv.getPlayerMoneyCount());
        Map map = new Map();
        Date date = new Date();
        Menu menu = new Menu();
        Party party = new Party();

        //Programs Goes through title screen and main menu items
        screen1.titleScreen(); //load title screen + opening credits
        //load main menu
        screen1.introAboutTrail(); // output history about trail
        screen1.loadMainMenu();
        // show top scores
        // options / management program
        //reset top 10 scores
        //reset gravestones
        //change aesthetics
        //Game Begins
        menu.setNames();
        // Short reminder about how the game works (distane, # of travelers, etc.)
        screen1.startDate();    //Ask When they will set off (with blurb about how that effects the trail)
        //Ask for social rank / starting cash (poor, rich, president)
        screen1.initialCash(inv.getPlayerMoneyCount()); //Display blurb about starting cash, what they could buy, and what they should buy.  (maybe add lore here based on class)
        shop.buyItems();
        //Display graphic for "Beginning the journey"
        inv.isWagonUsable();


        //Game Loop
        //increment date
        //increment weather / terrain if needed
        //increment distance to oregon                      (DONE)
        //increment distance to next location
        //remove food
        //update health
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

        System.out.println(inv.getOxenCount());
        System.out.println(inv.getPlayerMoneyCount());

        while((map.getPosition() <  250) && !party.getGameOverStatus())
        {
            map.progressBar();

            //increment date by 1
            date.setDate(1);



            // increment weather / terrian if needed
            map.setClimateZone();
            date.setWeather(map.getClimate());
            date.setTemp(map.getClimate());
            date.setGrass(map.getClimate());



            /*

            PUT SOMETHING HERE IN ORDER TO GIVE THE PLAYER
            CHOICES TO DO FOR EACH DAY
            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

             */









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