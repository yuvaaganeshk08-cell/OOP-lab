public class ToString{
    public static void main(String[] args) {
        Class c = new Class("CSE", 'A', 2026);
        System.out.println(c);
    }
}

class Class{
    String course;
    char section;
    int year;

    Class(String course, char section, int year){
        this.course = course;
        this.section = section;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Course: " + this.course + ", Section: " + this.section + ", Year: " + this.year; 

    }
}