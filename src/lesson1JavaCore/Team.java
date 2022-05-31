package lesson1JavaCore;

public class Team {
    private final String name;
    private final TeamMember[] members;

    public Team(String name1, TeamMember... members) {
        this.name = name1;
        this.members = members;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public void showInformation() {
        StringBuilder membersString = new StringBuilder();
        for (int i = 0; i < members.length; i++) {
            TeamMember member = members[i];
            membersString.append(member.getName()).append(" ");
        }
        System.out.printf("Название команды: %s. Состав команды: %s%n", name, membersString);
    }

    public void showResults() {
        StringBuilder completedCourseMembers = new StringBuilder();
        StringBuilder notCompletedCourseMembers = new StringBuilder();
        for (int i = 0; i < members.length; i++) {
            TeamMember member = members[i];
            if (member.isPassDistance()) {
                completedCourseMembers.append(member.getName()).append(" ");
            } else {
                notCompletedCourseMembers.append(member.getName()).append(" ");
            }
        }

        showInformation();
        System.out.printf("Результаты команды %s: участники завершившие полосу препятствий: %s, участники не добравшиеся до финиша: %s%n",
                name, completedCourseMembers, notCompletedCourseMembers);
    }
}
