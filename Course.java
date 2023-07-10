public class Course {
    Teacher teach;
    String name;
    String code;
    String prefix;
    double note;
    int coNote;

    Course (String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teach){
        if (teach.branch.equals(this.prefix)){
            this.teach = teach;
        }else{
            System.out.println("Teacher and lesson sections don't match!");
        }

    }

    void printTeacher(){
        this.teach.printInfo();
    }


}
