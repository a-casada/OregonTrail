public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Menu screen1 = new Menu();
        screen1.loadMainMenu();
        screen1.learnAboutTrail();
        screen1.startDate();
        int initialMoney = 1000;
        screen1.initialCash(initialMoney);
    }
}
