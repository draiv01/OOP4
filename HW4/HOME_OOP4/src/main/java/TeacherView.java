import java.util.Scanner;

public class TeacherView {
    // Метод запуска программы
    static void start(){
        boolean status = true;
        TeacherController teacherController = new TeacherController();
        Scanner scan = new Scanner(System.in);
        while (status) {
            System.out.println("MENU\n" +
                    "Для выхода введите -> 0 \n" +
                    "Для добавления учителя введите -> 1 \n" +
                    "Для вывода списка учителей введите -> 2 \n" +
                    "Для редактирования учителя введите 3");
            Integer process = scan.nextInt();

            switch (process) {

                case 0: status = false;
                    break;
                case 1: {
                    System.out.println("Введите имя учителя: ");
                    scan.nextLine();
                    String name = scan.nextLine();
                    System.out.println("Введите какой предмет преподает учитель: ");
                    String subject = scan.nextLine();
                    teacherController.teacherCreate(name, subject);
                    System.out.println();
                    break;
                }
                case 2:
                    teacherController.printGroupTeacher();
                    break;
                case 3:
                    System.out.println("Введите имя учителя которого хотите отредактировать: ");
                    scan.nextLine();
                    String oldName = scan.nextLine();
                    System.out.println("Введите Новое имя учителя: ");
                    String newName = scan.nextLine();
                    System.out.println("Измените предмет: ");
                    String newSubject = scan.nextLine();
                    teacherController.teacherCorrected(oldName,newName,newSubject);
                    System.out.println();
                    break;
            }
        }
        scan.close();
    }
    public static void main(String[] args) {
        start(); // запуск программы
    }
}
