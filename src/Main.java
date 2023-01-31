public class Main {
    public static void main(String[] args) {

        // int ticketPrice = 14_000;
        // int oneBonusMile = 20;

        // System.out.println("За ваш билет будет начислено " + (ticketPrice / oneBonusMile) + " бонусных миль");

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}