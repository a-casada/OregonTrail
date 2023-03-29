public class Inventory
{
    private int playerMoneyCount = 1600;
    private int foodCount = 0;
    private int clothingCount = 0;
    private int bulletsCount = 0;
    private int oxenCount = 0;
    private int wagonWheelCount = 4;
    private int wagonAxleCount = 1;
    private int wagonTongueCount = 1;
    private int medicalSupplyCount = 0;
    private int familyPet = 1;
    private boolean wagonUsable = false;

    public Inventory()
    {

    }

    public void goToShop()
    {
        Shop goToTheShop = new Shop(playerMoneyCount);
    }

    public boolean isWagonUsable()
    {
        if (wagonWheelCount >= 4 && wagonAxleCount >= 1 && wagonTongueCount >= 1)
        {
            wagonUsable = true;
        }
        else
        {
            wagonUsable = false;
        }

        return wagonUsable;
    }

    public int getPlayerMoneyCount()
    {
        return playerMoneyCount;
    }

    public int getFoodCount()
    {
        return foodCount;
    }

    public int getClothingCount()
    {
        return clothingCount;
    }

    public int getBulletsCount()
    {
        return bulletsCount;
    }

    public int getOxenCount()
    {
        return oxenCount;
    }

    public int getWagonWheelCount()
    {
        return wagonWheelCount;
    }

    public int getWagonAxleCount()
    {
        return wagonAxleCount;
    }

    public int getWagonTongueCount()
    {
        return wagonTongueCount;
    }

    public int getMedicalSupplyCount()
    {
        return medicalSupplyCount;
    }

    public int getFamilyPet()
    {
        return familyPet;
    }

    public boolean getWagonUsableStatus()
    {
        return wagonUsable;
    }

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
