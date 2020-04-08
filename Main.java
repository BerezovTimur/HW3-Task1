public class Main {
    public static void main(String[] args) {
        float TicketPrice = 1000F;
        float BonusMile = 20F;
        float TotalBonus = TicketPrice / BonusMile ;
        int TotalBonus1 = (int) TotalBonus;
        System.out.println(TotalBonus1);
    }
}