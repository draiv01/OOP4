public class TeacherService {
    public boolean NameValid(Teacher teacher){
        if ((teacher.getName() != null) && (teacher.getSubject() != null)){
            return true;
        }
        return false;
    }
}
