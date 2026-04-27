package CompositePattern.UniversityCourseStructure;

import java.util.ArrayList;
import java.util.List;

public class CourseGroup implements CourseComponent {
    private String name;
    private List<CourseComponent> components;

    public CourseGroup(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    // Add component
    public void add(CourseComponent component) {
        components.add(component);
    }

    // Remove component (Improvement)
    public void remove(CourseComponent component) {
        components.remove(component);
    }

    @Override
    public int getCredits() {
        int total = 0;
        for (CourseComponent c : components) {
            total += c.getCredits(); // Recursive call
        }
        return total;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "Course Group: " + name);
        for (CourseComponent c : components) {
            c.showDetails(indent + "   "); // Indentation improvement
        }
    }

    @Override
    public void showDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showDetails'");
    }
}