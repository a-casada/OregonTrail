public class Main {

    public static void main(String[] args) {
        Menu screen1 = new Menu();
        Inventory inv = new Inventory();

        screen1.loadMainMenu();
        screen1.learnAboutTrail();
        screen1.startDate();
        screen1.initialCash(inv.getPlayerMoneyCount());
        inv.goToShop();
    }
}
