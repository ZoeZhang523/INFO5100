package Q3;

public class DessertShop {
    public final static double taxRate = 6.5;
    public final static String storeName = "Desert Dessert";
    public final static int maxNameSize = 25;
    public final static int costWidth = 6;

    public static String cents2dollarsAndCents(int cents){
        String str = "";
        if(cents < 0){
            str += "-";
            cents += -1;
        }
        int dollars = cents / 100;
        cents = cents % 100;
        if(dollars > 0)
            str += dollars;
        str += ".";
        if(cents < 10)
            str += "0";
        str += cents;
        return str;
    }
}
