package Q5;
import java.util.Calendar;

public class Cat extends Pet implements Boardable {
    private String hairLength;
    private Date bStart, bEnd;

    public  Cat(String name, String ownerName, String color, String hairLength){
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength(){
        return hairLength;
    }
    @Override
    public String toString(){
        return "CAT:\n" + super.toString() + "\nHair: " + this.getHairLength() + "\n";
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
