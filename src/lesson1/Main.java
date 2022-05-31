package lesson1;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(
                new Barrier(BarrierType.JUMP, 5),
                new Barrier(BarrierType.SWIM, 7),
                new Barrier(BarrierType.WALK, 3)
        ); // Создаем полосу препятствий
        Team team = new Team("Команда",
                new TeamMember("Участник 1", 8),
                new TeamMember("Участник 2", 2),
                new TeamMember("Участник 3", 10),
                new TeamMember("Участник 4", 5)
        ); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
