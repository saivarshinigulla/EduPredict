public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(
                "S101",
                "Varshini",
                "23CSE001",
                "CSE",
                92.5,
                88,
                5
        );


        s1.study();
        s1.attendClass();
        s1.displayStudent();
    }
}