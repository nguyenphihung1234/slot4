package exercise1;

/**
 * Lớp Exercise1.Client sử dụng lớp Exercise1.Student để xây dựng chương trình java theo kịch bản.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client {
    public static void main(String[] agrs) {
        Student studentA;
        Student studentB;

        studentA = new Student();
        studentB = new Student(1, "Nguyen Van A", true);

        studentB.printInfo();

        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
