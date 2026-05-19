package MVCPattern.StudentManagementSystem;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void updateView(){
        view.displayStudent(model.getName(), model.getid());
    }

    public void setStudentName(String name){
        model.setName(name);
    }
}
