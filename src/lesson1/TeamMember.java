package lesson1;

public class TeamMember {
    public final String name;
    public final int power;
    public boolean passDistance;

    public TeamMember(String name1, int power1) {
        this.name = name1;
        this.power = power1;
    }

        public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isPassDistance() {
        return passDistance;
    }

    public void setPassDistance(boolean passDist) {
        this.passDistance = passDist;
    }
}
