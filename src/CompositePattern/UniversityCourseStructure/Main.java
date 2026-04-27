package CompositePattern.UniversityCourseStructure;

public class Main {
    public static void main(String[] args) {
        Module math = new Module("Mathematics", 3);
        Module prog = new Module("Programming", 4);
        CourseGroup semester1 = new CourseGroup("Semester 1");
        semester1.add(math);
        semester1.add(prog);
        Module db = new Module("Database", 3);
        CourseGroup degree = new CourseGroup("Degree Program");
        degree.add(semester1);
        degree.add(db);
        degree.showDetails();
        System.out.println("Total Credits: " + degree.getCredits());
    }
}
