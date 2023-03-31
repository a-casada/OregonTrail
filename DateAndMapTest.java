import java.util.Arrays;

public class DateAndMapTest {
    public static void main(String[] args) {
        int[] today = {1, 3, 2023};
        Date date = new Date(today);


        date.setDate(1);
        date.setWeather(0);
        System.out.print(date.getWeather() + " ");
        System.out.println(date);
        date.setDate(1);
        date.setWeather(0);
        System.out.print(date.getWeather() + " ");
        System.out.println(date);
        date.setDate(1);
        date.setWeather(0);
        System.out.print(date.getWeather() + " ");
        System.out.println(date);
        date.setDate(1);
        date.setWeather(0);
        System.out.print(date.getWeather() + " ");
        System.out.println(date);


        System.out.println(Arrays.toString(date.getLastRain()));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");



        System.out.println("MAP CLASS TESTING");
        System.out.println("");
        System.out.println("");
        Map map = new Map();

        System.out.println(map.getClimate());
        System.out.println(map.getDistToLM());
        System.out.println(map.getPosition());
        System.out.println(map.getLastLandmark());
        System.out.println(map.getNextLandmark());
        map.setPosition(25);
        System.out.println(map.getLastLandmark());
        System.out.println(map.getNextLandmark());
        map.setClimateZone();
        System.out.println(map.getClimate());







    }
}