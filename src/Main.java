public class Main {
    public static void main(String[] args) {

        double ticketPrice = 13676;
        int milesPerRub = 20;
        int miles = (int) (ticketPrice / milesPerRub);
        System.out.println("Начислено миль: " + miles);
    }
}