package CompositePattern.UniversityCourseStructure;

interface CourseComponent {
    int getCredits();
    void showDetails();
    void showDetails(String indent);
}
