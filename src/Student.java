public class Student extends User {

    private String rollNo;
    private String branch;
    private double attendance;
    private int internalMarks;
    private int studyHours;

    public Student(String studentId, String name,
                   String rollNo, String branch,
                   double attendance, int internalMarks,
                   int studyHours){
        super(studentId, name);
        this.rollNo = rollNo;
        this.branch = branch;
        this.attendance = attendance;
        this.internalMarks = internalMarks;
        this.studyHours = studyHours;

        System.out.println("Student Object created successfully!");
    }
    void study(){
        System.out.println(getName() + " is studying");
    }
    void attendClass(){
        System.out.println(getName()+ " attended the class");
    }

    public void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    public String getRollNo(){
        return rollNo;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public String getBranch(){
        return branch;
    }
    public void setAttendance(double attendance) {
        if (attendance >= 0 && attendance <= 100) {
            this.attendance = attendance;
        } else {
            System.out.println("Invalid attendance");
        }
    }
    public double getAttendance(){
        return attendance;
    }
    public void setInternalMarks(int internalMarks){
        if(internalMarks >= 0 && internalMarks <= 100){
        this.internalMarks = internalMarks;
    }
        else{
            System.out.println("Invalid Internal Marks!");
        }
    }
    public int getInternalMarks(){
        return internalMarks;
    }
    public void setStudyHours(int studyHours) {
        if (studyHours >= 0) {
            this.studyHours = studyHours;
        } else {
            System.out.println("study hours cannot be negative !");
        }
    }
    public int getStudyHours(){
        return studyHours;
    }

    void displayStudent(){
        System.out.println("ID: " + getStudentId() );
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Attendance: " + attendance);
        System.out.println("Internal Marks: " + internalMarks);
        System.out.println("Study Hours: " + studyHours);
    }
}
