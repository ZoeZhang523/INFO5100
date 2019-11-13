package StuInfoSystem;

public class Students {
    String name;
    Gender gender;
    int id;

    public Students(String name, Gender gender, int id){
        this.name = name;
        this.gender = gender;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public Gender getGender(){
        return gender;
    }
    public int getId(){
        return id;
    }
}
