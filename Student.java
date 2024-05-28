public class Student implements Comparable<Student> {

    private int studentID;
    private String firstName;
    private String secondName;
    private String lastName;
    
    public Student(int studentID, String firstName, String secondName, String lastName) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
    
    public int getStudentID() {
        return studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student [StudentID=" + studentID + ",\n firstName=" + firstName + ", \nsecondName=" + secondName
                + ", \nlastName=" + lastName + "]";
    }

    @Override
    public int compareTo(Student o) {
    // if(studentID > o.studentID)return 1;
    // if (studentID < o.studentID)return -1;  
    return Integer.compare(studentID, o.studentID);     
        }
            }

