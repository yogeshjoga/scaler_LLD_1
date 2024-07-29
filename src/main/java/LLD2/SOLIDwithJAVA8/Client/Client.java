package LLD2.SOLIDwithJAVA8.Client;

import LLD2.SOLIDwithJAVA8.BirdObject.FlyHigh;
import LLD2.SOLIDwithJAVA8.Birds.Eagle;

public class Client {

    public static void main(String[] args) {

        Eagle eagle = new Eagle(new FlyHigh());
        eagle.fly();
    }
}
