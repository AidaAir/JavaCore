package lesson1;

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
            membersString.append(member.getName()).append(", ");
        }
        System.out.printf("Название команды: %s. Состав команды: %s%n", name, membersString);
    }

    public void showResults() {
        String completedCourseMembers = "";
        String notCompletedCourseMembers = "";
        for(TeamMember member : members) {
            if (member.isPassDistance()) {
                completedCourseMembers = completedCourseMembers + member.getName() + ","+" "; // если все препятствия пройдены, то записываем участника в список добравшихся к финишу
            } else {
                notCompletedCourseMembers = notCompletedCourseMembers + member.getName() + ","+" "; // иначе он лузер
            }
        }

        showInformation();
        System.out.printf("Результаты команды %s: участники завершившие полосу препятствий: %s, участники не добравшиеся до финиша: %s%n",
                name, completedCourseMembers, notCompletedCourseMembers);
    }
}

