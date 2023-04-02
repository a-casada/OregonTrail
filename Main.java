public class Main {

    public static void main(String[] args) {
        //Program Loads objects
        Menu screen1 = new Menu();
        Inventory inv = new Inventory();
        //Programs Goes through title screen and main menu items
        screen1.loadMainMenu(); //load title screen + opening credits
                                //load main menu
        screen1.learnAboutTrail(); // output history about trail
                                // show top scores
                                // options / management program
                                    //reset top 10 scores
                                    //reset gravestones
                                    //change aesthetics
        //Game Begins
            // Short reminder about how the game works (distane, # of travelers, etc.)
        screen1.startDate();    //Ask When they will set off (with blurb about how that effects the trail)
                                //Ask for social rank / starting cash (poor, rich, president)
        screen1.initialCash(inv.getPlayerMoneyCount()); //Display blurb about starting cash, what they could buy, and what they should buy.  (maybe add lore here based on class)
        inv.goToShop(); //Display starting shop
            //Display graphic for "Beginning the journey"

        //Game Loop
            //note if gravestone was passed (display if so)
            //increment date
            //increment weather / terrain if needed
            //increment distance to oregon
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


    }
}
