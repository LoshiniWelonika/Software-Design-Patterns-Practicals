package MVCPattern.StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("Andrew",101);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println();

        controller.setStudentName("Selena");

        controller.updateView();
    }
    
}
