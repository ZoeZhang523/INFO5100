package Q3;

public class Checkout {
    private DessertItem[] items;
    private int numItems;

    public Checkout(){
        items = new DessertItem[100];
        numItems = 0;
    }
    public void clear(){
        for(int i = 0; i < numItems; i++)
            this.items[i] = null;
        numItems = 0;
    }
    public void enterItem(DessertItem item){
        items[numItems++] = item;
    }
    public int numberOfItems(){
        return numItems;
    }

    public int totalCost() {
        int tc = 0;
        for(int i = 0; i < numItems; i++){
            DessertItem dItems = items[i];
            tc += dItems.getCost();
        }
        return tc;
    }
    public int totalTax(){
        return (int)Math.round((totalCost() * DessertShop.taxRate)/100.00);
    }
    @Override
    public String toString() {
        String s = "\t" + DessertShop.storeName + "\n";
        s += "\t------------------\n\n";
        for(int j = 0; j < numItems; j++){

            String l = items[j].getName();

            String p = DessertShop.cents2dollarsAndCents(items[j].getCost());
            if (p.length() > DessertShop.costWidth)
                p = p.substring(0, DessertShop.costWidth);

            if (items[j] instanceof IceCream) {
                while(l.length() < 30 - p.length()){
                    l += " ";
                }
                s += l + p + "\n";
            }
            else if (items[j] instanceof Sundae) {

                s += ((Sundae)items[j]).getTopping() + " Sundae with\n";

                while(l.length() < 30 - p.length()){
                    l += " ";
                }
                s += l + p + "\n";
            }
            else if (items[j] instanceof Candy){
                s += ((Candy)items[j]).getWeight() + " lbs @ " +
                        DessertShop.cents2dollarsAndCents(((Candy)items[j]).getPricePerPound()) + " /lb.\n";

                while(l.length() < 30 - p.length()){
                    l += " ";
                }
                s += l + p + "\n";
            }
            else {
                s += ((Cookie)items[j]).getNumber() + " @ " +
                        DessertShop.cents2dollarsAndCents(((Cookie)items[j]).getPricePerDozen()) + " /dz\n";

                while(l.length() < 30 - p.length()){
                    l += " ";
                }
                s += l + p + "\n";
            }
        }

        String line = "\nTax";
        String tax = DessertShop.cents2dollarsAndCents(this.totalTax());
        while(line.length() <= 30 - tax.length())
            line += " ";
        s += line + tax;

        String totalCost = DessertShop.cents2dollarsAndCents(this.totalCost() + this.totalTax());
        line = "\nTotal Cost";
        while(line.length() <= 30 - totalCost.length())
            line += " ";
        s += line + totalCost;
        return s;
    }
}
