package Q2;

public class HappyObject extends MoodyObject {
    protected String getMood(){ return "happy"; };

    public void expressFeelings(){
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    };

    public String toString(){
        return "Observation: Subject laughs a lot ";
    };
}
