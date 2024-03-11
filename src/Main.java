public class Main {
    public static void main(String[] args) {

        Human hm = new Human();
        Human hm2 = new Human();
        hm.name = "Посетитель_1";
        hm2.name = "Посетитель_2";
        Market market = new Market();

        market.acceptToMarket(hm);
        market.acceptToMarket(hm2);
        market.takeInQueue(hm);
        market.takeInQueue(hm2);
        market.update();
        market.update();
        market.releaseFromMarket(hm);
        market.releaseFromMarket(hm2);
    }
}