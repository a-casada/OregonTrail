import java.util.Scanner;

public class Shop
{
    private int playerMoneyCount = 0;
    private int foodPurchased = 0;
    private int clothingPurchased = 0;
    private int bulletsBoxPurchased = 0;
    private int oxenPurchased = 0;
    private int wagonWheelPurchased = 0;
    private int wagonAxlePurchased = 0;
    private int wagonTonguePurchased = 0;
    private int medicalSupplyPurchased = 0;
    private int moneyUsed = 0;

    public Shop(int playerMoneyCount)
    {
        this.playerMoneyCount = playerMoneyCount;
        buyItems();
    }

    public void buyItems()
    {
        Scanner in = new Scanner(System.in);

        final int FOODPRICE = 1;
        final int CLOTHINGPRICE = 10;
        final int BULLETSBOXPRICE = 2;
        final int OXENPRICE = 20;
        final int WAGONPARTPRICE = 10;
        final int MEDICALSUPPLYPRICE = 2;

        int item = 0;
        int amount = 0;

        while(item != 9)
        {
            System.out.println("You can buy: \n 1: Food ($1 for 5 pounds) \n 2: Set of Clothing ($10 for one set) \n 3: Box of Bullets ($2 per box, 20 bullets per box) \n 4: Oxen ($20 each) \n 5: Extra Wagon Wheel ($10 each) \n 6 Extra Wagon Axle ($10 each) \n 7 Extra Wagon Tongue ($10 each) \n 8 Medical Supply Box ($2 each) \n Type '9' to exit");
            System.out.print("What item would you like to buy? ");
            item = in.nextInt();
            System.out.print("How many of this item do you want? ");
            amount = in.nextInt();

            switch(item)
            {
                case 1:
                {
                    foodPurchased = amount;
                    moneyUsed = moneyUsed + foodPurchased * FOODPRICE;
                }
                break;
                case 2:
                {
                    clothingPurchased = amount;
                    moneyUsed = moneyUsed + clothingPurchased* CLOTHINGPRICE;
                }
                break;
                case 3:
                {
                    bulletsBoxPurchased = amount;
                    moneyUsed = moneyUsed + bulletsBoxPurchased* BULLETSBOXPRICE;
                }
                break;
                case 4:
                {
                    oxenPurchased = amount;
                    moneyUsed = moneyUsed + oxenPurchased* OXENPRICE;
                }
                break;
                case 5:
                {
                    wagonWheelPurchased = amount;
                    moneyUsed = moneyUsed + wagonWheelPurchased* WAGONPARTPRICE;
                }
                break;
                case 6:
                {
                    wagonAxlePurchased = amount;
                    moneyUsed = moneyUsed + wagonAxlePurchased* WAGONPARTPRICE;
                }
                break;
                case 7:
                {
                    wagonTonguePurchased = amount;
                    moneyUsed = moneyUsed + wagonTonguePurchased* WAGONPARTPRICE;
                }
                break;
                case 8:
                {
                    medicalSupplyPurchased = amount;
                    moneyUsed = moneyUsed + medicalSupplyPurchased* MEDICALSUPPLYPRICE;
                }
                break;
                case 9:
                {
                    resetItems();
                    System.out.println("Exiting the shop...");
                    moneyUsed = 0;
                }
                break;
                default:
                {
                    System.out.println("That is not an item!");
                }
            }

            if(item != 9)
            {
                item = 0;
                amount = 0;
            }
        }
    }

    public void resetItems()
    {
        Inventory player = new Inventory();

        if (playerMoneyCount >= moneyUsed)
        {
            player.setPlayerMoneyCount(playerMoneyCount - moneyUsed);
            player.setFoodCount(foodPurchased * 5);
            player.setClothingCount(clothingPurchased);
            player.setBulletsCount(bulletsBoxPurchased * 20);
            player.setOxenCount(oxenPurchased);
            player.setWagonWheelCount(wagonWheelPurchased);
            player.setWagonAxleCount(wagonAxlePurchased);
            player.setWagonTongueCount(wagonTonguePurchased);
            player.setMedicalSupplyCount(medicalSupplyPurchased);
        }
        else
        {
            player.setPlayerMoneyCount(playerMoneyCount);
            System.out.println("You do not have enough money!");
            System.out.println("Go out of my shop!!!");
        }

    }
}