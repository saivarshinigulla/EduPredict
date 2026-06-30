public class Student {
     private String studentId;
    private String name;
    private String rollNo;
    private String branch;
    private double attendance;
    private int internalMarks;
    private int studyHours;

    Student(){
        System.out.println("Student Object created sucessfully!");
    }
    void study(){
        System.out.println(name + " is studying");
    }
    void attendClass(){
        System.out.println(name+ " attended the class");
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String getStudentId(){
        return studentId;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
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
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("Attendance: " + attendance);
        System.out.println("Internal Marks: " + internalMarks);
        System.out.println("Study Hours: " + studyHours);
    }
}
