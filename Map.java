//Map.java-----by Alex Burkholder------3-30-2023
//This class stores Map data and does all

public class Map {
    //--------Variables
    private String[] landmarks = {"Origin", "Landmark1", "Landmark2", "Landmark3"};
    private int[] distLMsToOrigin = {0, 25, 50, 75};
    private boolean[] isRiverAtLandmark = {false, false, true, true};
    private int[] climates = {0, 1, 0, 0};
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
        String land;
        if (getDistToLM() == 0){
            this.lastLandmark++;
            land = landmarks[lastLandmark];
            return land;
        }
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
     * Updates the current position by adding the distance traveled to the current position
     * */
    public void setPosition(int distanceTraveled){
        position = position + distanceTraveled;
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

}
