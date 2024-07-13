package LLD2.SOLID;

public class Eagle extends Bird  implements Flyable{

    private Fly fly;

    Eagle(Fly fly){
        this.fly = fly;
    }

    @Override
    public void makeNoise(){
    }

    @Override
    public void fly(){
        fly.makeFly();
    }


}
