package MiscellaneousExercises.FirstActivity;

public class Main {
    public static void main(String[] args) {
        NoticeBoard noticeBoard = new NoticeBoard();

        Observer student1 = new Student("Alice");
        Observer student2 = new Student("Bob");
        Observer student3 = new Student("Charlie");

        noticeBoard.subscribe(student1);
        noticeBoard.subscribe(student2);
        noticeBoard.subscribe(student3);

        noticeBoard.postNotice("Exam schedule released!");
        System.out.println();

        noticeBoard.unsubscribe(student2);

        noticeBoard.postNotice("Workshop on AI tomorrow!");
    }
}
