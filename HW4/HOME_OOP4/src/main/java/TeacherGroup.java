import java.util.ArrayList;
import java.util.List;

public class TeacherGroup {
//    region Поля
    private TeacherService valid = new TeacherService();
    private   List<Teacher> teacherList = new ArrayList<>();

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    //endregion
    public void addTeacher(Teacher teacher){
        if(valid.NameValid(teacher)){
            teacherList.add(teacher);
        }else{
            System.out.println("Учителя невозможно добавить в группу Учителей, т.к недостаточно данных об Учителе");
        }


    }


}
