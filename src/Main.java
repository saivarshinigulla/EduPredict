public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setStudentId("S101");
        s1.setName("Varshini");
        s1.setRollNo("23CSE001");
        s1.setBranch("CSE");
        s1.setAttendance(92.5);
        s1.setInternalMarks(88);
        s1.setStudyHours(5);

        s1.study();
        s1.attendClass();
        s1.displayStudent();
    }
}