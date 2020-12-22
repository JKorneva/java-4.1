public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int Price = 50000;
        int Miles = service.Calculate(Price);
        System.out.println(Miles);
    }

}
