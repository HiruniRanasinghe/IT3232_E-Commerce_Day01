public class Ex06 {
    public static void main(String[] args) {
        
        Student[] students = new Student[5];
        
        
        students[0] = new Student("John", 85);
        students[1] = new Student("Emily", 92);
        students[2] = new Student("Michael", 78);
        students[3] = new Student("Sarah", 95);
        students[4] = new Student("David", 88);
        
        
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        
        double averageMarks = totalMarks / students.length;
        System.out.println("Average marks of students: " + averageMarks);
        
       
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    private String name;
    private double marks;
    
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getName() {
        return name;
    }
    
    public double getMarks() {
        return marks;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }
}