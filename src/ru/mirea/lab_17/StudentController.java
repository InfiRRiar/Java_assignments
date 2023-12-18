package ru.mirea.lab_17;

public class StudentController {
    private final Student model;
    private final StudentView view;
    StudentController(Student model, StudentView view)
    {
        this.model = model;
        this.view = view;
    }
    void updateView()
    {
        view.printViewDetails(getStudentName(), getStudentRollNo());
    }
    public String getStudentName() {
        return model.getName();
    }
    public void setStudentName(String name) {
        this.model.setName(name);
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }
    public void setStudentRollNo(String name) {
        this.model.setRollNo(name);
    }
}
