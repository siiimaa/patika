public class Student {
    Course math;
    Course bio;
    Course eng;
    String name;
    String studentNumber;
    String classes;
    double avarage;
    boolean isPass;

    Student (String name, String studentNumber, String classes, Course math, Course bio, Course eng){
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.math = math;
        this.bio = bio;
        this.eng = eng;
        this.avarage = 0;
        this.isPass = false;

    }

    void addBulkExamNotes(double mathNote, double mathConv, double bioNote, double bioConv, double engNote, double engConv){
        if (mathNote >= 0 && mathNote <= 100 &&
            mathConv >= 0 && mathConv <= 100){
            this.math.note = (double) ((mathNote * 0.80) + (mathConv * 0.20));
        }

        if (bioNote >= 0 && bioNote <= 100&&
            bioConv >= 0 && bioConv <= 100){
            this.bio.note = (double) ((bioNote * 0.80) + (bioConv * 0.20));
        }

        if (engNote >= 0 && engNote <= 100&&
            engConv >= 0 && engConv <= 100){
            this.eng.note = (double) ((engNote * 0.80) + (engConv * 0.20));
        }
    }
    void calcAvarage(){
        this.avarage = (this.math.note + this.bio.note + this.eng.note) / 3.0;
        notePrint();
    }
    boolean isPass(){
        System.out.println("-------------");
        calcAvarage();
        if(this.avarage >= 55.0){
            System.out.println("You passed the class!");
            return true;
        }else
            return false;
    }
    void notePrint(){
        System.out.println("Student's Name : " + this.name);
        System.out.println("Student's Number : " + this.studentNumber);
        System.out.println(this.math.name + " Note : " + this.math.note);
        System.out.println(this.bio.name + " Note : " + this.bio.note);
        System.out.println(this.eng.name + " Note : " + this.eng.note);
        System.out.println(this.avarage);
    }
}