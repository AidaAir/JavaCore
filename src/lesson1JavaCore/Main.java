package lesson1JavaCore;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(
                new Barrier(BarrierType.JUMP, 8),
                new Barrier(BarrierType.SWIM, 4),
                new Barrier(BarrierType.WALK, 10)
        );

        Team team = new Team("The best",
                new TeamMember("Joe", 2),
                new TeamMember("Nick", 6),
                new TeamMember("Kate", 8),
                new TeamMember("Lucy", 15)
        );

        course.doIt(team);
        team.showResults();
    }
}

