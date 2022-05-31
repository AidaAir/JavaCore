package lesson1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(
                new Barrier(BarrierType.JUMP, 5),
                new Barrier(BarrierType.SWIM, 7),
                new Barrier(BarrierType.WALK, 3)
        );
        Team team = new Team("Команда",
                new TeamMember("Участник 1", 8),
                new TeamMember("Участник 2", 2),
                new TeamMember("Участник 3", 10),
                new TeamMember("Участник 4", 5)
        );
        c.doIt(team);
        team.showResults();
    }
}
