package assignment3;
import java.util.*;

public class Course {

    private int courseId;
    private String courseName;
    private int maxCapacity;
    private int professorId;
    private int credits;
    private int[] studentIds;

    public Course(){

    }

    //Q1
    public Course(int courseId){
        this.courseId = courseId;
    }
    public Course(int courseId, int professorId){
        this(courseId);
        this.professorId = professorId;
    }
    public Course(int courseId, int professorId, int credits){
        this(courseId, professorId);
        this.credits = credits;
    }

    public void registerStudent(int studentId){
        int[] tempArray = new int[studentIds.length + 100];
        Scanner temp = new Scanner(System.in);
        //int studentIds = temp.nextInt();
        for(int i = 0; i < studentIds.length; i++){
            tempArray[i] = studentIds[i];
        }
        tempArray[studentIds.length] = temp.nextInt();
        studentIds = tempArray;
    }

    //Q2
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) {

        if((courseId <= 0)){
            this.courseId = courseId;
        }
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) {

        if((courseName.length() > 10)&&(courseName.length() < 50)){
            this.courseName = courseName;
        }
    }

    public int getMaxCapacity(){ return maxCapacity; }
    public void setMaxCapacity(int maxCapacity) {
        if((maxCapacity >= 10)&&(maxCapacity <= 100)) {
            this.maxCapacity = maxCapacity;
        }
    }

    public int getProfessorId(){ return professorId; }

    public void setProfessorId(int professorId) {
        if((professorId >= 100000)&&(professorId <= 1000000)) {
            this.professorId = professorId;
        }
    }

    public int getCredits() { return credits; }
    public void setCredits(int credits) {
        if((credits > 0)&&(credits < 10)){
            this.credits = credits;
        }
    }

    public int[] getStudentIds() { return studentIds; }
    public void setStudentIds(int[] studentIds) {
        this.studentIds = studentIds;
    }

    //Q3
    public int[] removeDuplicates(int[] studentIds){
        int[] str = studentIds;
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 0; i < str.length; i++){
            if(!l.contains(str[i])){
                l.add(str[i]);
            }
        }
        for(int i = 0; i < l.size(); i++){
            studentIds[i] = l.get(i);
        }
        return studentIds;
    }

    //Q4
    public int groupsOfStudents(int[] studentIds) {
        int even = 0, odd = 0;
        for(int i = 0; i < studentIds.length; i++) {
            if(studentIds[i] % 2 == 0){
                even++;
            }
        else odd++;
        }
        int groups = (odd * (odd - 1) + even * (even - 1))/2;
        return groups;
    }
}

