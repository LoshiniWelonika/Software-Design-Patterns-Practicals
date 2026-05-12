package TemplateMethod.ExamConductingSystem;

abstract class Exam {

    final void conductExam() {
        startExam();
        answerQuestions();
        submitExam();
        generateResults();
    }

    void startExam() {
        System.out.println("Exam Started");
    }

    abstract void answerQuestions();

    void submitExam() {
        System.out.println("Exam Submitted");
    }

    void generateResults() {
        System.out.println("Results Generated");
    }
}
