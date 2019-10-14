package Q5;

public class Pet {
    private String name;
    private String ownerName;
    private String color;

    public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;
    enum sexid{MALE, FEMALE, SPAYED, NEUTERED};
    protected sexid sex;

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName(){
        return name;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public String getColor(){
        return color;
    }
    void setSex(int sexid){
        try{
            switch(sexid){
                case MALE:
                    sex = sex.MALE;
                    break;
                case FEMALE:
                    sex = sex.FEMALE;
                    break;
                case SPAYED:
                    sex = sex.SPAYED;
                    break;
                case NEUTERED:
                    sex = sex.NEUTERED;
                    break;
            }
        } catch(Exception e){
            throw new IllegalArgumentException("Value not exists!");
        }
    }
    String getSex(){
        return sex.toString();
    }
    @Override
    public String toString(){
        String output = this.name + " owned by " + this.ownerName + "\nColor: " + this.color + "\nSex: " + this.getSex();
        return output;
    }
}

