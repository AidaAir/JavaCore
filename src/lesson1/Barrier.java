package lesson1;

public class Barrier {
    private BarrierType type;
    private int difficult;

    public Barrier(BarrierType type1, int difficulty) {
        this.type = type1;
        this.difficult = difficulty;
    }

    public BarrierType getType() {
        return type;
    }

    public int getDifficult() {
        return difficult;
    }
}
