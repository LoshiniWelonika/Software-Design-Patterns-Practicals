package CompositePattern.UniversityCourseStructure;

class Module implements CourseComponent {
    private String name;
    private int credits;
   
    public Module(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void showDetails() {
        System.out.println("Module: " + name + " (" + credits + " credits)");
    }
}
