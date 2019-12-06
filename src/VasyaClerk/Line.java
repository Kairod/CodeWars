package VasyaClerk;

/*
I need to change the money in three separated values: billet of 25, 50 and 100
 */

public class Line {
    public static String Tickets(int[] peopleInLine){
        int money = 0;
        final int price = 25;
        int diff = 0;
        for (Integer client : peopleInLine) {
            diff = client-price;
            if(diff < 0 || diff > money){
                return "NO";
            }
            else if(diff > 0) {
                money -= diff;
            }
            else{
                money += price;
            }
        }
        return "YES";
    }
}
