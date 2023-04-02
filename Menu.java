import java.util.Scanner;
public class Menu {
    private int pace;
    private int ration;

    public Menu() {
        this.pace = 0;
        this.ration = 0;
    } // default

    /**
     * Load Main Menu
     * Sets the display for the main menu, does NOT receive inputs or give outputs.
     *      1. Travel the trail
     *      2. Learn about the trail
     *      3. See the Oregon Top Ten
     *      4. Choose Management Options
     *      5. End
     */

    public void loadMainMenu()
    {
        System.out.println("[========================================================================]");
        System.out.println("░▀▀█▀▀░█░░░░█▀▀░░░▒█▀▀▀█░█▀▀▄░█▀▀░█▀▀▀░▄▀▀▄░█▀▀▄░░░▀▀█▀▀░█▀▀▄░█▀▀▄░▀█▀░█░░\n░░▒█░░░█▀▀█░█▀▀░░░▒█░░▒█░█▄▄▀░█▀▀░█░▀▄░█░░█░█░▒█░░░░▒█░░░█▄▄▀░█▄▄█░░█░░█░░\n░░▒█░░░▀░░▀░▀▀▀░░░▒█▄▄▄█░▀░▀▀░▀▀▀░▀▀▀▀░░▀▀░░▀░░▀░░░░▒█░░░▀░▀▀░▀░░▀░▀▀▀░▀▀▀\n By: A. Burkholder A. Casada, A. Guzman, and K. McClure ");
        System.out.println("[========================================================================]");
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
                "\n\n Today you will be carving your own path on the trail, playing in the shoes of 13 year old Hattie Camblee." +
                "\n Will you aid your family in making it to Oregon, or will you be one of the 20,000 individuals to lose their life on the trail?\n");
        System.out.println("[========================================================================]");
        continu();
    }
    /**
     * Learn about Trail
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

    public void learnAboutHattie()
    {
        System.out.println("@@@@@@@@@@@@@@&GYYYYY5555555Y?~:     ..::::^~7J55555YYYYYYYYYJJJ5B@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@&B555555555555Y7.     ..:::^~!~~^::^^~7Y555YYYYYYYYYJYP#@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@#PY555555555P5!....::^^~~~!!!!!~~^^~~^:::!Y55YYYYYYYYYYJYG&@@@@@@@@@@\n" +
                "@@@@@@@@@@B555555555555P7..:^!7???JJJJJJJ???77!~~^::..7PP55YYYYYYYYYJ5#@@@@@@@@@\n" +
                "@@@@@@@@&BGPPP55555555PJ:.^7YY555PPPPPPP55YYYJ?7!!~:. 7GGP555YYYYYYYYY5#@@@@@@@@\n" +
                "@@@@@@@&GPPPPPPPPPPPPPP!.^!JY55PPPPPPPPPP555YYYY??!^..~PPPPPP55555YY5555B@@@@@@@\n" +
                "@@@@@@&GPPPPPPPPPPPPPPP7.~?Y55PPPPPPPPPP55555YYJ?!~^:.:YPP555PPPPPP555YY5B@@@@@@\n" +
                "@@@@@&GPPPPPPPPPPPPPPPGJ:!YY55PPPPPPPPP55YYY55YJ!~^::. !PPPP55555555555555#@@@@@\n" +
                "@@@@@GPPPPPPPPPPPPPPGGG7.!7??777J5P55Y?77?JJYJYY?~^:.. ^PGPPPPPPP5555555YY5#@@@@\n" +
                "@@@@#GGGGPGGGGGGGGGGGGP^.7?!!!~!7YPPYJ?77~!7?YJYY7^:..^?PPPPPPPPPPPPPP55555P&@@@\n" +
                "@@@&GGGGGGGGGGGGGGGGGGG?^?JJJJ?YYYP5YYY5Y???J5555J^:^~!YGPPPPPPPPPPPPPPPPPPPB@@@\n" +
                "@@@BGGGGGPPPPGGGGGGGGGGP!7Y5PPPP5555YY5PPPPPP5YYYJ~^~77YPPPPPPPPPPPPPPPPPPPPP&@@\n" +
                "@@&GGGPP55PPPPPGPPGGGGG5~!?Y55PPYYYJJY5PPPPP55YJ?7!~~7YPPPPPPPPPPPPPP55PPPPPPB@@\n" +
                "@@BPPPP555PPPPPPPPPPPP5JYY7JY5PPYYYYY5PPPP555YJJ?777?YPPPP5555P5YYYYJJ5PP5PPPG&@\n" +
                "@&G555555PPPPPPPPPPPPPPPGP??Y555YY5YY5555555YJJ??~?55555JJJJJP5J?????5PP55Y5PP#@\n" +
                "@#5555555PPPPP5PPPPPPPPPPP5??YJ?777777?Y55YYYJ??7!JJJJJJJ???JJJ?77???5PPPJ~!YPB@\n" +
                "@#5YYY555PPPPPPPPPP5555555PY??YJ??JJJJ5555YYJ????YJJ?JJJJJJ??J??????J5PPP7^^?PB@\n" +
                "@BYYYYYY5555555555P555Y5555P5J?YY55PP5555YJ???JJJYJJ??JJJJJ??JJJ?????5PP5!^^JPP&\n" +
                "@BYYYYYYYYYYYY5555555555555555YJJJJJJJ??777?JYYJYJJ??JJJJJJ??JJJJ????5PPP7:!P55&\n" +
                "@BYYYJJJYYYYYYYYYYYYYYYYYYYYYYYYYJ!!!!77?JYY55555YYYPGPJ777!!!!!!7!!!7JY55Y5PY5&\n" +
                "@BYJJJJJJJJJJJJJJJJJJJJJJJJJJJJJYY~!??JYYY555555PPGGPPPY777777!!!!!7!7!?55555YP@\n" +
                "@#5555555555555555555555YYYJ?7JPPJ77?JJYY55PPGGGGPYJ?!~^^~!!7!!!77!!?7!J5PP55YG@\n" +
                "@&G55555YYYYYJJJYYYYJJ?77!~~~~755YY??YPPPGGP5J??7~^^^~~~~^^^~7JJ?77~!J77J?JJJY#@\n" +
                "@@BYYYYYYJJJJJJJ?!^~~^~^^~7JJY55YJ?J?J5P5?!~^^^~~~!!!!!!!~~~~^^^7?JJJJ?!777!!J&@\n" +
                "@@&5Y55YYYYY55J!~^~!!!!~~JYYYYYYY5555Y?~^:^~!!!!!!!!!!!!!!!!!!!~~~!JJJ7!?YJ7!G@@\n" +
                "@@@GYYYYYYYY5J~^~!!!!!^^J5YYYYYYYY5555J~~!!!!!!!!77!!!!!!!77777!!!~^~7??!777J&@@\n" +
                "@@@&5JYYYYYY?~~!!!!~~^~J55555YYYY555Y?7?!!!!!!!!7!!!!!!!7!!77!7777!~~^^!7777G@@@\n" +
                "@@@@BJJJYYY7~^~!~~^~^755555555555Y?~:.:^!!!!!!!!!!!!7!!!!!7!!7?7!!~~~~^~Y5YG@@@@\n" +
                "@@@@@PJYYY7~~^^~^^^!J5555555555Y!^:^~!!!!!!!!!!!!!!!!~!!!!~!777!!7!~~^^^JY5&@@@@\n" +
                "@@@@@&5JYJ~^^:^:^~75555555555Y7::~!!!!!!!!!!!!!!7!!!~!!!!~~77!!!!7!!~^^^!Y#@@@@@\n" +
                "@@@@@@&5Y?^::..^!77?J555555Y7^.^!!!!!7!!!!!!!!7!!~!~!!~!~!77!!!!!!!!!~^:~B@@@@@@\n" +
                "@@@@@@@&PJ~...~7!!777777?J?^.:!!!!!!!!!!!!!77!!!!!~~~~!^!7!!!!!!!!!!!~^!G@@@@@@@\n" +
                "@@@@@@@@&G~..~!~!7777~^^^:..^!!!!!!!!!!!7!7!!!!!!~~^^!^~7!~!!!!!!!!!!~?#@@@@@@@@\n" +
                "@@@@@@@@@@P~^~~!?777!~~~^..^!!!!!!!!!!!777~^^^~~~~^:~~^!!~~!~~!!!!!!!5&@@@@@@@@@\n" +
                "@@@@@@@@@@@#Y7!!777~^^^^: :!!!!!!!!!7777!~~~~~~~~~::~:^!~~~!~~!!~~~?G@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@BJ7!!~::::: .^!!!!!!!!7!7!!~!!~~~~~~^:^^:^~~~~~~~!~~75&@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@&G?~^^~^^. :~~~~~~!!!!!!~~~~~~~~^^^::^^:~^~~~~^^~75#@@@@@@@@@@@@@@\n" +
                "Above: Hattie Campbell on her 13th birthday, only weeks away from crossing the Oregon Trail");
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
                "\n Medical Supply Box - For healing the diseased and preventing death" + "\n   (Press 1 to continue to the shop)");
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
