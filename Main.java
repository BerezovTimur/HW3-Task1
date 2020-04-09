public class Main {
    public static void main(String[] args) {
        float ticketPrice = 1000F;
        float bonusMile = 20F;
        float totalBonus = ticketPrice / bonusMile ;
        int finalBonus = (int) totalBonus;
        System.out.println(finalBonus);
    }
}