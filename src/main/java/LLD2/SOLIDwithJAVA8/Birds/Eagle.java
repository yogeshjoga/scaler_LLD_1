package LLD2.SOLIDwithJAVA8.Birds;

import LLD2.SOLIDwithJAVA8.BirdObject.*;

public class Eagle extends Bird {
    private FlyBe flyBe;
    private SwimBe swimBe;

    Eagle(){}


    public Eagle(FlyBe flyBe){
        this.flyBe = flyBe;
    }

    Eagle(FlyBe flyBe, SwimBe swimBe){
        this.flyBe = flyBe;
        this.swimBe = swimBe;
    }

    // Functional Interface
    Flyable flyable = () -> {flyBe.amIFly();};

    // Functional Interface
    Swimable swimable = () -> {swimBe.amISwim();};

}
