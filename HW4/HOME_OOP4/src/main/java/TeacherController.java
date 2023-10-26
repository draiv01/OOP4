import java.util.Scanner;

public class TeacherController {
    TeacherGroup tg =  new TeacherGroup();

    public void teacherCreate(String name, String subject){
            tg.addTeacher(new Teacher(name,subject));
    }

    public void printGroupTeacher(){
        System.out.println(tg.getTeacherList());
        System.out.println();
    }

    public void teacherCorrected(String oldName, String newName, String newSubject){
        for (int i = 0; i < tg.getTeacherList().size(); i++) {
            if(tg.getTeacherList().get(i).getName().equals(oldName)){
                tg.getTeacherList().get(i).setName(newName);
                tg.getTeacherList().get(i).setSubject(newSubject);
                System.out.println("Изменения внесены успешно!");
            }
            else {
                System.out.println("Учитель не найден");
            }
        }
    }

}
