/**
 * Programming 2 Oregon Trail Project
 * @author Alex Burkholder
 * @since March 30, 2023
 *
 * Description: The Map class stores all map data, including the distance from the start of the trail and all the various
 * locations and their data.
 */


public class Map {
    //--------Variables
    private String[] landmarks = {"Independence, Missouri", "Kansas River Crossing", "Big Blue River Crossing", "Fort Kearny", "Chimney Rock", "Fort Laramie", "Independence Rock", "South Pass", "Fort Bridger" , "Green River", "Soda Springs", "Fort Hall", "Snake River", "Blue Mountains", "The Dalles", "Oregon City"};
    private int[] distLMsToOrigin = {0, 102, 200, 250, 490, 830, 950, 1055, 1170, 1240, 1320, 1420, 1700, 1880, 1930, 2000}; // distance from starting location in miles
    private boolean[] isRiverAtLandmark = {false, true, true, false, false, false, false, false, false, false, true, false, false, true, false, false, false};
    private boolean[] isShopAtLandmark = {true, false, false, true, false, true, false, false, true, false, false, true, false, false, false, false};
    private int[] climates = {0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
    private int lastLandmark; // most recent index for gathering data from the arrays
    private int position; // in miles
    private int currentClimateZone;
    private int depthAtRiver;

    //----------------constructors
    /**Map()
     * Default class constructor - creates an instance of Map that stores position data for the game
     * */
    public Map(){
        lastLandmark = 0;
        position = 0;
        currentClimateZone = climates[lastLandmark];
    }
    //---------------functions
    /**getClimate()
     * Fetches the current climate zone to be used in other, classes such as date, to calculate position based data
     * @return The current climate zon the player is in
     * */
    public int getClimate(){
        return currentClimateZone;
    }

    /**getDistance2Landmark()
     * calculates distance from the next landmark based on current position.
     * @return Distance to the next landmark
     * */
    public int getDistToLM(){
        return distLMsToOrigin[lastLandmark + 1] - position;
    }

    /**getPosition()
     * gets the current miles traveled along the trail
     * @return total distance traveled
     * */
    public int getPosition(){
        return position;
    }

    /**getRiver()
     * This function will get the data for the next Landmark's river
     * @return The depth at next river, or 0 if there is no river
     * */
    public int getRiver(){
        if (isRiverAtLandmark[lastLandmark+1]){
            return depthAtRiver;
        }
        else return 0;
    }

    /**getLastLandmark()
     * Gets the name of the last landmark
     * @return A string with the name of the last landmark
     * */
    public String getLastLandmark(){
        return landmarks[lastLandmark];
    }

    /**getNextLandmark()
     * Gets the name of the next landmark
     * @return A string with the name of the next landmark
     * */
    public String getNextLandmark(){
        return landmarks[lastLandmark + 1];
    }

    /**setClimateZone()
     * Updates the climate zone to the most recent zone
     * */
    public void setClimateZone(){
        currentClimateZone = climates[lastLandmark];
    }

    /**setPosition(int distanceTraveled)
     * Updates the current position by adding the distance traveled to the current position.
     * Will stop progress
     * */
    public void setPosition(int distanceTraveled) {
        if (position + distanceTraveled < distLMsToOrigin[lastLandmark + 1])
        position = position + distanceTraveled;
        else {
            position = distLMsToOrigin[lastLandmark+1];
            lastLandmark++;
            System.out.println(getLastLandmark());
        }
    }

    /**setRiver(int[] lastRain, int[] date)
     * Updates the river levels based on data from the Date class and an internal algorithm
     * @param date The current date to check the river
     * @param lastRain The date of the last rain
     * */
    public void setRiver(int[] lastRain, int[] date){

        while (date[1] > lastRain[1]){
            date[1] = date[1]-1;
            if (date[1] == 2){
                date[0] = date[0]+ 28;
            }
            else if (date[1] %2 == 0){
                date[0] = date[0]+ 30;
            }
            else if (date[1] %2 == 1){
                date[0] = date[0]+ 31;
            }
        }
        int numDays = date[0] - lastRain[0];

    }

    /**progressBar()
     * Prints the position as a percent of the total journey to be traveled
     * */
    public void progressBar() {
        System.out.println("Progress Percentage: " + ((((double)position) / 250.0) *100) + "%");
    }

    /**isShop()
     * Tells weather a shop is present or not
     * @return true if at a landmark and there is a shop
     * */
    public boolean isShop() {
        if (getDistToLM()==0 && isShopAtLandmark[lastLandmark]){
            return true;
        }
        else return false;
    }

    /**isRiver()
     * Gets if there is a river or not at the location
     * @return true if is a river
     * */
    public boolean isRiver() {
        return isRiverAtLandmark[lastLandmark];
    }
}