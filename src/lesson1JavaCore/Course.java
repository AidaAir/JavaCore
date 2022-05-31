package lesson1JavaCore;

public class Course {
    private final Barrier[] barriers;

    public Course(Barrier... barriers) {
        this.barriers = barriers;
    }

    public void doIt(Team team) {
        for (TeamMember member : team.getMembers()) {
            for (Barrier barrier : barriers) {
                if (member.getPower() >= barrier.getDifficult()) {
                    member.setPassDistance(true);
                } else {
                    member.setPassDistance(false);
                    break;
                }
                System.out.printf("Прохождение участником %s препятствия %s, результат %s%n", member.getName(), barrier.getType(), member.isPassDistance());

            }
        }
    }
}
