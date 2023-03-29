public class Menu {
    private int pace = 0;
    private int ration = 0;

    public Menu() {} // default

    /**
     * Load Main Menu
     * Sets the display for the main menu, does NOT receive inputs or give outputs.
     *      1. Travel the trail
     *      2. Learn about the trail
     *      3. See the Oregon Top Ten
     *      4. Choose Management Options
     *      5. End
     */

    public static void loadMainMenu()
    {
        System.out.println("░▀▀█▀▀░█░░░░█▀▀░░░▒█▀▀▀█░█▀▀▄░█▀▀░█▀▀▀░▄▀▀▄░█▀▀▄░░░▀▀█▀▀░█▀▀▄░█▀▀▄░▀█▀░█░░");
        System.out.println("░░▒█░░░█▀▀█░█▀▀░░░▒█░░▒█░█▄▄▀░█▀▀░█░▀▄░█░░█░█░▒█░░░░▒█░░░█▄▄▀░█▄▄█░░█░░█░░");
        System.out.println("░░▒█░░░▀░░▀░▀▀▀░░░▒█▄▄▄█░▀░▀▀░▀▀▀░▀▀▀▀░░▀▀░░▀░░▀░░░░▒█░░░▀░▀▀░▀░░▀░▀▀▀░▀▀▀");
    }

    /**
     * Learn about Trail
     * Displays the "Learn about the trail" text to inform the user about the trail.
     */

    public static void learnAboutTrail()
    {

    }

    /**
     * See Top Ten
     * Displays the top ten expeditions on the menu, both names and scores.
     * Asks if we would like to see how points are earned.
     * Y - display how points are earned, then return to main menu
     * n - return to main menu
     */

    public static void seeTopTen()
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
    public static void chooseManagementOptions()
    {

    }

    /**
     * Set Names
     * Displays the name setting screen.
     * Asks user for the names of the 5 traveling members.
     * Display the names for the user
     * Asks the user if the names are correct.
     * @return String[5] of the names as an array.
     */
    public  String[] setNames()
    {
        String[] name = new String[5];
        for (int i = 0; i < 5; i++)
        {
         name[i] = "Player" + (i+1);

        }
    return  name;
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
       // int input = UserInput;
        int[] date = new int[3];

        date[0] = 1;    //Set day
        date[1] = 4;    //Set initial month in case of error
        date[2] = 1860; //Set Year
      /*  do {
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
        return date;
    }



    /**
     * initial Cash
     * Displays the "Here is your initial cash" Screen:
     *      Display in-depth motive for leaving oregon
     *      Display Spendable Cash
     *      Provide descriptions for items available in the shop
     *      Provide hints for the trail.
     */
    public static void initialCash(int playerMoneyCount)
    {
        System.out.println("[==========================================================]");
        System.out.println("You have" + playerMoneyCount + " dollars. Spend them wisely...");
        System.out.println("In the shop you can find x, y,  and z items");
        System.out.println("X does this.");
        System.out.println("Y does that.");
        System.out.println("Z does blah blah blah.");
        System.out.println("[==========================================================]");
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
