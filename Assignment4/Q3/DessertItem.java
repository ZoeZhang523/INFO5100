package Q3;

public abstract class DessertItem {
    public DessertItem(){
        this("");
    }
    protected String name;
    public DessertItem(String name){
        if(name.length() <= DessertShop.maxNameSize)
            this.name = name;
        else
            this.name = name.substring(0, DessertShop.maxNameSize);
    }
    public final String getName(){
        return name;
    }
    public abstract int getCost();
}
