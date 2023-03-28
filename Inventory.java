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

    public int setPlayerMoneyCount(int playerMoneyCount)
    {
        this.playerMoneyCount = this.playerMoneyCount + playerMoneyCount;
    }

    public int setFoodCount(int foodCount)
    {
        this.foodCount = this.foodCount + foodCount;
    }

    public int setClothingCount(int clothingCount)
    {
        this.clothingCount = this.clothingCount + clothingCount;
    }

    public int setBulletsCount(int bulletsCount)
    {
        this.bulletsCount = this.bulletsCount + bulletsCount;
    }

    public int setOxenCount(int oxenCount)
    {
        this.oxenCount = this.oxenCount + oxenCount;
    }

    public int setWagonWheelCount(int wagonWheelCount)
    {
        this.wagonWheelCount = this.wagonWheelCountwagonWheelCount;
    }

    public int setWagonAxleCount(int wagonAxleCount)
    {
        this.wagonAxleCount = this.wagonAxleCount + wagonAxleCount;
    }

    public int setWagonTongueCount(int wagonTongueCount)
    {
        this.wagonTongueCount = this.wagonTongueCount + wagonTongueCount;
    }

    public int setMedicalSupplyCount(int medicalSupplyCount)
    {
        this.medicalSupplyCount = this.medicalSupplyCount + medicalSupplyCount;
    }

    public int setFamilyPet(int familyPet)
    {
        this.familyPet = this.familyPet + familyPet;
    }

    public boolean setWagonUsable(boolean wagonUsable)
    {
        this.wagonUsable = wagonUsable;
    }


}
