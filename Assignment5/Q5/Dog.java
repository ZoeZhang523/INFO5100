package Q5;

public class Dog extends Pet implements Boardable {
    private String size;
    private Date bStart, bEnd;

    public Dog (String name, String ownerName, String color, String size){
        super(name, ownerName, color);
        this.size = size;
    }
    public String getSize(){
        return size;
    }
    @Override
    public String toString(){
        return "DOG:\n" + super.toString() + "\nSize: " + this.getSize() + "\n";
    }
    @Override
    public void setBoardStart(int month, int day, int year){
        bStart = new Date(month, day, year);
    }
    @Override
    public void setBoardEnd(int month, int day, int year){
        bEnd = new Date(month, day, year);
    }
    @Override
    public boolean boarding(int month, int day, int year){
        Date boarding = new Date(month, day, year);
        return (boarding.less(bEnd) && boarding.more(bStart));
    }
}
