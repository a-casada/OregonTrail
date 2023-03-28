public class Shop extends Inventory
{
    private int playerMoneyCount = 0;
    private int foodPrice = 1;
    private int clothingPrice = 10;
    private int bulletsBoxPrice = 2;
    private int oxenPrice = 20;
    private int wagonWheelPrice = 10;
    private int wagonAxlePrice = 10;
    private int wagonTonguePrice = 10;
    private int medicalSupplyPrice = 2;

    //______________________________________________________

    //NEED TO GET THE AMOUNTS FROM USER INPUT OF EACH OF THESE FOODS THAT WILL BE PURCHASED
    private int foodPurchased;
    private int clothingPurchased;
    private int bulletsBoxPurchased;
    private int oxenPurchased;
    private int wagonWheelPurchased;
    private int wagonAxlePurchased;
    private int wagonTonguePurchased;
    private int medicalSupplyPurchased;

    public Shop()
    {

    }

    public void resetItems()
    {
        setFoodCount();
        setClothingCount();
        setBulletsCount();
        setOxenCount();
        setWagonWheelCount();
        setWagonAxleCount();
        setWagonTongueCount();
        setMedicalSupplyCount();
        setFamilyPet();
        setWagonUsable();

        // total money used code

        //setPlayerMoneyCount
    }
}