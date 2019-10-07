package Q2;

public class SadObject extends MoodyObject {
    protected String getMood(){ return "sad"; };
    public void expressFeelings(){
        System.out.println("'wah''boo hoo''weep''sob''weep'");
    };
    public String toString(){
        return "Observation: Subject cries a lot";
    };
}
