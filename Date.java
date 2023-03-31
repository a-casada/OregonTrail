//Date.java-----by Alex Burkholder------3-28-2023
//This class stores date data and does all daily calculations for weather and climate
import java.util.Random;

public class Date {
    Random rand = new Random();
    //-------------variables
    private int[] date;
    private int[] lastRain;
    private String currentWeather;
    private int currentTemp;
    private String currentGrass;

    //numbers taken from online historical data
    private int[][] avgTemps = {
            {26, 28, 37, 49, 61, 70, 74, 73, 67, 54, 42, 31}, //Oregon Temps
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12}
    };

    //These numbers are calculated by taking the number of rainy days in a month divided by total days in that month
    private double[][] rainChance = {
            {26.7, 20, 23.3, 30, 33.3, 67, 26.7, 23.3, 20, 23.3, 23.3, 23.3},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12}
    };

    //-----------------constructors

    /**Date
     * default class constructor - Creates an instance of the Date class to be used in the game
     * */
    public Date(){
        int[] a = {0,0,0};
        date = a;
        currentWeather = "Clear";
        int[] b = {-1, -1, -1};
        lastRain = b;
}
    /**Date
     * Class constructor - Creates an instance of the Date class to be used in the game
     * @param startDate An array of length 3 with the form: day, month, year
     * */
    public Date(int[] startDate){
        this.date = startDate;
        currentWeather = "Clear";
        int[] a = {-1, -1, -1};
        lastRain = a;
    }

    //-------------functionality

    /**getDate()
     * The easy way to get the date out as you put it in
     * @return The date as an array of length 3 with the form: day, month, year
     * */
    public int[] getDate() {
        return this.date;
    }

    /**getDay()
     * The easy way to get the day
     * @return The day as an int
     * */
    public int getDay() {return date[0];}

    /**getMonth()
     *The easy way to get the month
     * @return The month as an int
     * */
    public int getMonth() {return date[1];}

    /**getYear()
     *The easy way to get the year
     * @return The year as an int
     * */
    public int getYear() {return date[2];}

    /**String getWeather()
     * The easy way to get the current weather
     * @return The sky's condition for the day
     * */
    public String getWeather() {

        return this.currentWeather;
    }

    /**getTemp()
     * The easy way to get the temperature
     * @return The temperature, as an integer, in Fahrenheit
     * */
    public int getTemp() {
        return this.currentTemp;
    }

    /**getGrass()
     *The easy way to get the grass conditions
     * @return The grass condition as a string
     * */
    public String getGrass() {
        return this.currentGrass;
    }

    /**getLastRain()
     *The easy way to get the date of last rain
     * @return An integer array in the form: day, month, year
     * */
    public int[] getLastRain() {
        return lastRain;
    }

    /**setDate(int numDays)
     * Easily increment the date by a given number of days
     * @param numDays The number of days passed
     * */
    public void setDate(int numDays) {
        this.date[0] = this.date[0] + numDays;

        boolean bigDay;
        if (date[0]>31 && date[1]%2 == 1){bigDay = true;}
        else if (date[0]>28 && date[1] == 2){bigDay = true;}
        else if (date[0]>30 && date[1]%2 == 0){bigDay = true;}
        else bigDay = false;
        while (bigDay){
            if (date[1]==2)
                date[0] = date[0]-28;
            else if (date[1] % 2 == 1)
                date[0] = date[0]-31;
            else if (date[1] % 2 == 0)
                date[0] = date[0]-30;
            date[1]++;
            if (date[0]>31 && date[1]%2 == 1){bigDay = true;}
            else if (date[0]>28 && date[1] == 2){bigDay = true;}
            else if (date[0]>30 && date[1]%2 == 0){bigDay = true;}
            else bigDay = false;
        }
    }

    /**setWeather(int climateZone)
     *Sets the weather conditions based on the climate at the location and time of year
     * @param climateZone The current climate the weather could be like. Provides a general range and likelihood of rain. Start at 0
     * */
    public void setWeather(int climateZone){
        int newWeather = rand.nextInt(100);
        if (newWeather>49){
            int chance = rand.nextInt(100);
            if (newWeather>85 && chance < rainChance[climateZone][date[1]]){
                currentWeather = "Heavy rain";
            }
            else if (chance < rainChance[climateZone][date[1]]) {
                currentWeather = "Rain";
            }
            else currentWeather = "Clear";
        }
        else {currentWeather = currentWeather;}

        if (currentTemp < 32 && currentWeather == "Heavy rain") {
            currentWeather = "Heavy snow";
        } else if (currentTemp < 32 && currentWeather == "rain") {
            currentWeather = "snow";
        }
        if (currentWeather.equals("Rain") || currentWeather.equals("Heavy rain")){
            lastRain[0] = date[0];
            lastRain[1] = date[1];
            lastRain[2] = date[2];
        }
    }

    /**setTemp(int climateZone)
     *Sets the temperature based on the climate at the location and time of year
     * @param climateZone The current temperatures it could be like. Provides a general range of temperatures. Start at Zone 0
     * */
    public void setTemp(int climateZone) {
        int dtemp = rand.nextInt(-20, 20);
        currentTemp = avgTemps[climateZone][date[1]]+ dtemp;
    }

    /**setGrass(int climateZone)
     * Sets the grass conditions based on recent rain and climate values
     * @param climateZone The current zone the grass should be calculated for. Start at Zone 0
     * */
    public void setGrass(int climateZone) {

    }

    /**toString()
     *Converts the class to a string for easy testing
     * @return The date as a string in the form Day/Month/Year
     * */
    public String toString(){
        return Integer.toString(date[0]) + "/" + Integer.toString(date[1]) + "/" + Integer.toString(date[2]);
    }
}
