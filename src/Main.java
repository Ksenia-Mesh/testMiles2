public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int price1 = 200;
        int miles1 = service.calculate(price1);
        System.out.println(miles1);


        int price2 = 500;
        int miles2 = service.calculate(price2);
        System.out.println(miles2);


        int price3 = 1_400;
        int miles3 = service.calculate(price3);
        System.out.println(miles3);
    }
}


