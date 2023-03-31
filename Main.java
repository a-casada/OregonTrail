public class Main {

    public static void main(String[] args) {
        Menu screen1 = new Menu();
        screen1.loadMainMenu();
        screen1.learnAboutTrail();
        screen1.startDate();

        Inventory inv = new Inventory();
        inv.goToShop();
    }
}
