package TemplateMethod.ExamConductingSystem;

public class Main {
    public static void main(String[] args) {

        Exam mcq = new MCQExam();
        mcq.conductExam();

        System.out.println();

        Exam coding = new CodingExam();
        coding.conductExam();
    }
}
