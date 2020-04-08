public class Main {
    public static void main(String[] args) {
        float ticketprice = 1000F;
        float bonusmile = 20F;
        float totalbonus = ticketprice / bonusmile ;
        int finalbonus = (int) totalbonus;
        System.out.println(finalbonus);
    }
}