package Task2;

import Task2.AbstractChairFactory;

public class ChairFactory  implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(100);
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
