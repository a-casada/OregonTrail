public class Inventory
{
    private int playerMoneyCount = 1600;
    private int foodCount = 0;
    private int clothingCount = 0;
    private int bulletsCount = 0;
    private int oxenCount = 0;
    private int wagonWheelCount = 4;
    private int wagonAxleCount = 2;
    private int wagonTongueCount = 1;
    private int medicalSupplyCount = 0;
    private boolean wagonUsable = false;

    /**
     * Default constructor for the Inventory class.
     */
    public Inventory()
    {

    }

    /**
     * Takes the player into the class.
     */
    public void goToShop()
    {
        Shop goToTheShop = new Shop(playerMoneyCount);
    }

    /**
     * Checks to make sure the wagon is usable.
     *
     * @return true if the wagon is usable
     */
    public boolean isWagonUsable()
    {
        if (wagonWheelCount >= 4 && wagonAxleCount >= 2 && wagonTongueCount >= 1)
        {
            wagonUsable = true;
        }
        else
        {
            wagonUsable = false;
        }

        return wagonUsable;
    }

    /**
     * Gets the player's amount of money.
     *
     * @return The player's current amount of money.
     */
    public int getPlayerMoneyCount()
    {
        return playerMoneyCount;
    }

    /**
     * Gets the player's amount of food.
     *
     * @return The player's current amount of food.
     */
    public int getFoodCount()
    {
        return foodCount;
    }

    /**
     * Gets the player's number of clothing sets.
     *
     * @return The player's current number of clothing sets.
     */
    public int getClothingCount()
    {
        return clothingCount;
    }

    /**
     * Gets the player's number of bullets.
     *
     * @return The player's current number of bullets.
     */
    public int getBulletsCount()
    {
        return bulletsCount;
    }

    /**
     * Gets the player's number of oxen.
     *
     * @return The player's current number of oxen.
     */
    public int getOxenCount()
    {
        return oxenCount;
    }

    /**
     * Gets the player's amount of money.
     *
     * @return The player's current number of wagon wheels.
     */
    public int getWagonWheelCount()
    {
        return wagonWheelCount;
    }

    /**
     * Gets the player's amount of money.
     *
     * @return The player's current amount of money.
     */
    public int getWagonAxleCount()
    {
        return wagonAxleCount;
    }

    /**
     * Gets the player's amount of money.
     *
     * @return The player's current amount of money.
     */
    public int getWagonTongueCount()
    {
        return wagonTongueCount;
    }

    /**
     * Gets the player's amount of money.
     *
     * @return The player's current amount of money.
     */
    public int getMedicalSupplyCount()
    {
        return medicalSupplyCount;
    }

    /**
     * Gets the player's wagon status.
     *
     * @return True if the player's wagon in usable.
     */
    public boolean getWagonUsableStatus()
    {
        return wagonUsable;
    }

    /**
     * Sets
     *
     * @param playerMoneyCount
     */
    public void setPlayerMoneyCount(int playerMoneyCount)
    {
        this.playerMoneyCount = playerMoneyCount;
    }

    public void setFoodCount(int foodCount)
    {
        this.foodCount = this.foodCount + foodCount;
    }

    public void setClothingCount(int clothingCount)
    {
        this.clothingCount = this.clothingCount + clothingCount;
    }

    public void setBulletsCount(int bulletsCount)
    {
        this.bulletsCount = this.bulletsCount + bulletsCount;
    }

    public void setOxenCount(int oxenCount)
    {
        this.oxenCount = this.oxenCount + oxenCount;
    }

    public void setWagonWheelCount(int wagonWheelCount)
    {
        this.wagonWheelCount = this.wagonWheelCount + wagonWheelCount;
    }

    public void setWagonAxleCount(int wagonAxleCount)
    {
        this.wagonAxleCount = this.wagonAxleCount + wagonAxleCount;
    }

    public void setWagonTongueCount(int wagonTongueCount)
    {
        this.wagonTongueCount = this.wagonTongueCount + wagonTongueCount;
    }

    public void setMedicalSupplyCount(int medicalSupplyCount)
    {
        this.medicalSupplyCount = this.medicalSupplyCount + medicalSupplyCount;
    }

}
