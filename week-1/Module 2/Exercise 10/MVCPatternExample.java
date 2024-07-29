public class MVCPatternExample {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("John Doe");
        model.setId("123");
        model.setGrade("A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
