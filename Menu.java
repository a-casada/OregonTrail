import java.util.Scanner;
public class Menu {
   //Variables
    private int pace;
    private int ration;

    //Contructors
    public Menu() {
        this.pace = 0;
        this.ration = 0;
    } // default

    /**Title Screen
     * Sets title screen
     */
    public void titleScreen()
    {
        System.out.println("[========================================================================]");
        System.out.println("░▀▀█▀▀░█░░░░█▀▀░░░▒█▀▀▀█░█▀▀▄░█▀▀░█▀▀▀░▄▀▀▄░█▀▀▄░░░▀▀█▀▀░█▀▀▄░█▀▀▄░▀█▀░█░░\n░░▒█░░░█▀▀█░█▀▀░░░▒█░░▒█░█▄▄▀░█▀▀░█░▀▄░█░░█░█░▒█░░░░▒█░░░█▄▄▀░█▄▄█░░█░░█░░\n░░▒█░░░▀░░▀░▀▀▀░░░▒█▄▄▄█░▀░▀▀░▀▀▀░▀▀▀▀░░▀▀░░▀░░▀░░░░▒█░░░▀░▀▀░▀░░▀░▀▀▀░▀▀▀\n By: A. Burkholder A. Casada, A. Guzman, and K. McClure ");
        System.out.println("[========================================================================]");
    }

    /**Load Main Menu
     * Sets the display for the main menu, does NOT receive inputs or give outputs.
     *      1. Travel the trail
     *      2. Learn about the trail
     *      3. See the Oregon Top Ten
     *      4. Choose Management Options
     *      5. End
     */
    public void loadMainMenu()
    {
        Scanner userIn = new Scanner(System.in); //Set up Scanner
        int userInput = 0;
        do {
            System.out.println("Main Menu: Choose from the options below to continue. \n" +
                    "     *      1. Travel the trail\n" +
                    "     *      2. Learn about the trail\n" +
                    "     *      3. Learn about Hattie Campbell\n" +
                    "     *      4. See the Oregon Top Ten\n" +
                    "     *      5. Visit the Graveyard\n" +
                    "     *      6. Choose Management Options\n");
            System.out.println("[========================================================================]");
            userInput = userIn.nextInt();
            switch (userInput) {
                case 1: {
                    //Start the Oregon Trail
                }
                break;
                case 2: {
                    learnAboutTrail();
                }
                break;
                case 3: {
                    learnAboutHattie();
                }
                break;
                case 4: {
                    System.out.println("Reference the soon-to-be-made top 10 class and retrieve the list of top 10 pioneers");
                    System.out.println("[========================================================================]");
                }
                break;
                case 5: {
                    System.out.println("Reference the gravestones list and tell the user where people died.");
                    System.out.println("[========================================================================]");
                }
                break;
                case 6: {
                    System.out.println("Provide options to the user");
                    System.out.println(" 1. Choose to reset the top 10 list to default");
                    System.out.println(" 2. Choose to reset the gravestones to default");
                    System.out.println(" 3. Change something aesthetic of the game.");
                    System.out.println(" 4. IDK what other options we want.");
                    System.out.println("[========================================================================]");
                }
                break;
                default: {
                }
                break;
            }
        }while (userInput != 1);
    }

    /**
     * Intro about trail
     * Short intro before main menu.
     */
    public void introAboutTrail()
    {
        System.out.println("About the Oregon Trail:" +
                "\n The Oregon Trail was a legendary 2170 mile stretch of land from Independence, Missouri to Oregon City, Oregon." +
                "\n This was no simple road trip for those who wanted to experience the west, and many people faced extreme hardships along the way." +
                "\n\n Today you will be carving your own path on the trail, playing in the shoes of 13 year old Hattie Campbell." +
                "\n Will you aid your family in making it to Oregon, or will you be one of the 20,000 individuals to lose their life on the trail?\n");
        System.out.println("[========================================================================]");
        continu();
    }
    /**Learn about Trail
     * Displays the "Learn about the trail" text in main menu.
     */

    public void learnAboutTrail()
    {
        System.out.println("About the Oregon Trail:" +
                "\n The Oregon Trail was a legendary 2170 mile stretch of land from Independence, Missouri to Oregon City, Oregon." +
                "\n In the early 1800s, the trail was utilized by fur traders, only traveling the tail on horseback." +
                "\n By 1836, wagon trains from Independence, Missouri began clearing the trail to Oregon. " +
                "\n As the years went on, roads, bridges, and ferries were built to speed up the journey. " +
                "\n In the 1840's, the Organic Laws of Oregon promised free land to any settlers who chose to move to Oregon." +
                "\n The term \"Manifest Destiny\" was coined to describe the thousands of families who traveled the trails, inspired by that very promise. " +
                "\n Many other families were inspired by the California Gold rush in 1948, inspired from the promise of riches." +
                "\n By the 1860's, many were traveling on ferries, with rivers and canals bring created to aid the pioneers." +
                "\n Finally, in 1869, the transcontinental railroad was completed, leading many to chose it over the trail.");
        System.out.println("[========================================================================]");
        continu();
    }

    /**
     * Learn about Hattie
     * Displays a picture of Hattie Campbell.
     */
    public void learnAboutHattie()
    {
        System.out.println("Hattie Campbell is a 13 year old pioneers, traveling with her family of 4 and pet.\n"+
                "She is cool.");
        continu();
    }
    /**
     * See Top Ten
     * Displays the top ten expeditions on the menu, both names and scores.
     * Asks if we would like to see how points are earned.
     * Y - display how points are earned, then return to main menu
     * n - return to main menu
     */
    public void seeTopTen()
    {

    }

    /**
     * Choose Management Options
     * Displays the "Management Options" Menu:
     *      See Current Top Ten List
     *      See Original Top Ten List
     *      Erase Current Top Ten List
     *      Erase Tombstone Messages
     *      Toggle Pictures (Turns off the fun photos we added for each fort)
     *      Return to the Main Menu.
     */
    public void chooseManagementOptions()
    {

    }

    /**
     * setStartDate
     * Displays the date selection screen.
     *      "Choose A Starting Month"
     *      1. March
     *      2. April
     *      3. May
     *      4. June
     *      5. July
     *      6. August
     *      7. September
     * Asks user to choose a month to depart.
     * Asks the user if they are sure.
     * @return int[3] (the date: DAY, MONTH (int), YEAR)
     */
    public int[] startDate()
    {
        boolean validInput = false;
        int[] date = new int[3];
        System.out.println("Choose A Starting Month (type number)\n" +
                "1. March\n" +
                "2. April\n" +
                "3. May\n" +
                "4. June\n" +
                "5. July\n" +
                "6. August\n" +
                "7. September");

        Scanner in = new Scanner(System.in);    //Set up Scanner
        int input = 0;                          //initialize input
        input =  in.nextInt();            //gets next integer input as input.

        date[0] = 1;    //Set day
        date[1] = 4;    //Set initial month in case of error
        date[2] = 1860; //Set Year
        do {
            switch (input) {
                case 1: {
                   date[1] = 3;
                    validInput = true;
                } // March
                break;
                case 2: {
                    date[1] = 4;
                    validInput = true;
                } // April
                break;
                case 3: {
                    date[1] = 5;
                    validInput = true;
                } // May
                break;
                case 4: {
                    date[1] = 6;
                    validInput = true;
                } // June
                break;
                case 5: {
                    date[1] = 7;
                    validInput = true;
                } // July
                break;
                case 6: {
                    date[1] = 8;
                    validInput = true;
                } // August
                break;
                case 7: {
                    date[1] = 9;
                    validInput = true;
                } // September
                break;
                default: {

                    validInput = false;
                }
                break;
            }
        }while (validInput = false); // Set Month */

        System.out.println("\nYour journey shall begin on " + date[1] + "-" + date[0] + "-" + date[2] + ".\n[=========================================================================]");
        continu();
        return date;

    }

    /**
     * Sets Names
     * Sets the inital names for the game.
     */
    public String[] setNames()
    {
        String names[] = new String[4];
        Scanner in = new Scanner(System.in);
        System.out.println("What are the names of yourself (1), your three family members (2, 3), and your pet (4)?");
        for(int i = 0; i <names.length; i++)
        {
            System.out.print("(" + (i+1) + ")");
            names[i] = in.nextLine();
        }
        System.out.println("[========================================================================]");

        return names;
    }
    /**
     * initial Cash
     * Displays the "Here is your initial cash" Screen:
     *      Display in-depth motive for leaving oregon
     *      Display Spendable Cash
     *      Provide descriptions for items available in the shop
     *      Provide hints for the trail.
     */
    public void initialCash(int playerMoneyCount)
    {
        System.out.println("Every family has their own reason for leaving for Oregon, but our family is hoping to escape the overcrowding here in Louisiana.\nOur father, a banker, has stored us a healthy " + playerMoneyCount +  "$ for our trip... hopefully he spends it well.\nThe Clerk at the store told us to stock up on Oxen, Bullets, and medicine.\nWe were told only those with the speed of one hundred horses, the hunting spirit of Kit Carson, and plentiful medicine would make it to Oregon.\nHopefully his words hold true, but he wouldn't be the first to trying and swindle us out the last of our savings...");
        System.out.println("\nIn the shop, you can buy: " +
                "\n Food - Feeds party members, can be obtained at traders or through hunting " +
                "\n Clothing - Protection from the weather" +
                "\n Box of Bullets - For hunting and protection from bandits " +
                "\n Oxen - Determines the speed of wagon (minimum: 4). Be wary of Oxen health. " +
                "\n Wagon Wheel - For Repairs, Trades, or Sale" +
                "\n Wagon Axle - For Repairs, Trades, or Sale" +
                "\n Wagon Tongue -  For Repairs, Trades, or Sale" +
                "\n Medical Supply Box - For healing the diseased and preventing death");
        System.out.println("[=========================================================================]");
        continu();
    }


    /**Continue Class
     * Adds: "submit "0" to continue"
     * Once zero is submitted, code finishes.
     */
    public void continu()
    {
        System.out.println("    Submit \"0\" to continue.");
        Scanner inContinu = new Scanner(System.in);    //Set up Scanner
        int input = 99;                          //initialize input
        boolean validinput = false;             //sets up toggleable variable
        do {
            input =  inContinu.nextInt();                  //gets next integer input as input.
            validinput = input == 0;
        }while(!validinput);
        System.out.println("[========================================================================]");
    }


    /**
     * Getters and setters
     * @return int
     */
    public int getPace() {return pace;}
    public void setPace(int pace) {this.pace = pace;}
    public int getRation() {return ration;}
    public void setRation(int ration) {this.ration = ration;}
}
