public class ArrayAndObject{
    public static void main(String[] args){

        Student s1 = new Student("Akilesh",002,9.9f);
        Student s2 = new Student("Dina",003,10.0f);
        Student s3 = new Student("Nolan",004,9.8f);
        Student[] students = {s1,s2,s3};

        for(Student student : students){
            student.Marks();
        }
    }
}

class Student{
    String name;
    int RollNo;
    float SGPA;

    Student(String name, int RollNo, float SGPA){
        this.name = name;
        this.RollNo = RollNo;
        this.SGPA = SGPA;

    }

    void Marks(){
        System.out.println("************");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + RollNo); 
        System.out.println("SGPA: " + SGPA);
        System.out.println("************");
    }
}