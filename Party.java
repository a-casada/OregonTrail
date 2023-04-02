import java.util.Scanner;

public class Party
{
    private String difficulty = "EASY";
    private String names[] = new String[4]; // five people and the pet
    private int health[] = new int[4]; // health out of 100
    private boolean isAlive[] = new boolean[4];
    private boolean gameOver = false;
    private boolean wonGame = false;

    public Party()
    {

    }

    public String[] getNames()
    {
        return names;
    }
    public boolean[] getLife()
    {
        return isAlive;
    }

    public String getDifficulty()
    {
        return difficulty;
    }

    public void setLife(boolean alive[])
    {
        isAlive = alive;
    }

    public void setHealth(int value[])
    {
        health = value;
    }

    /**
     * Set Names
     * Displays the name setting screen.
     * Asks user for the names of the 5 traveling members.
     * Display the names for the user
     * Asks the user if the names are correct.
     * @return String[5] of the names as an array.
     */
    public void setNames(String[] names)
    {
        this.names = names;
    }
}