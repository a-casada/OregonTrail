public class Party
{
    private String difficulty = "EASY";
    private String names[] = new String[6]; // five people and the pet
    private int health[] = new int[6]; // health out of 100
    private boolean isAlive[] = new boolean[6];
    private boolean gameOver = false;
    private boolean wonGame = false;

    public Party()
    {

    }

    public boolean[] getLife()
    {
        return isAlive;
    }

    public String getDifficulty()
    {
        return difficulty;
    }

    public void updateLife(boolean alive[])
    {
        isAlive = alive;
    }

    public void updateHealth(int value[])
    {
        health = value;
    }

}