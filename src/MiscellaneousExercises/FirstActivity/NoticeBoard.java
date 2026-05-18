package MiscellaneousExercises.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class NoticeBoard implements Subject {
    private List<Observer> students = new ArrayList<>();
    private String latestNotice;

    @Override
    public void subscribe(Observer observer) {
        students.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        students.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer student : students) {
            student.update(latestNotice);
        }
    }

    public void postNotice(String notice) {
        this.latestNotice = notice;
        notifyObservers();
    }
}
