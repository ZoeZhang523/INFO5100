package Q5;

public class Date {
    private int day, month, year;

    Date(int month, int day, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean less(Date date){
        if (this.year < date.year) return true;
        else if (this.year == date.year) {
            if (this.month < date.month) return true;
            else if (this.month == date.month && this.day <= date.day) return true;
        }
        return false;
    }
    public boolean more(Date date){
        if (this.year > date.year) return true;
        else if (this.year == date.year) {
            if (this.month > date.month) return true;
            else if (this.month == date.month && this.day >= date.day) return true;
        }
        return false;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            throw new IllegalArgumentException("Enter month between 1-12");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31) {
            throw new IllegalArgumentException("Enter day between 1-31");
        }
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1000 || year > 9999) {
            throw new IllegalArgumentException("Enter year of four digit");
        }
        this.year = year;
    }
}
