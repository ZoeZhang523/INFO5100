package Q2;

public abstract class MoodyObject {
    String moodyObject;
    protected abstract String getMood();

    protected abstract void expressFeelings();
    public void queryMood(){
        if(this.getMood() == "happy")
            System.out.println("I feel happy today!\n");
        else
            System.out.println(("I feel sad today!\n"));
    }
}