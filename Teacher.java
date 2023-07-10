public class Teacher {
    String name;
    String branch;
    String phoneNumber;


    Teacher(String name, String branch, String phoneNumber){
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;

    }

    void printInfo (){
        System.out.println("Name \t: " + this.name);
        System.out.println("Branch \t: " + this.branch);
        System.out.println("Mobile Phone Number \t: " + this.phoneNumber);

    }
}
