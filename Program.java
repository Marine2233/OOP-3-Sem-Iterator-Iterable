import java.util.ArrayList;


public class Program{
    public static void main(String[] args) {
        Student student1 = new Student(5, "abc", "byf", "jffcgvb");
        Student student2 = new Student(3, "aav", "akhf","pkjhg");
        Student student3 = new Student(1, "AAA", "jbr", "asgk");
        Student student4 = new Student(2, "Aop", "hoy", "vcdf");
        Student student5 = new Student(4, "don", "Ai", "fghvb");

        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);
        studentGroup.addStudent(student5);
        StudentGroup stg = new StudentGroup(new ArrayList<>());
        stg.addStudent(student5);
        stg.addStudent(student1);
        StudentGroup stG = new StudentGroup(new ArrayList<>());
        stG.addStudent(student2);
        stG.addStudent(student4);
        stG.addStudent(student1);


        Flow flow1 = new Flow(new ArrayList<>());
        flow1.addStudentGroup(studentGroup);
        Flow flow2 = new Flow(new ArrayList<>());
        flow2.addStudentGroup(stg);
        flow2.addStudentGroup(stG);

        FlowComparator flowComparator = new FlowComparator();
        flowComparator.compare(flow1,flow2);

        

        
        
        // printListStudent(flow2);

        // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup.getStudentList());
        // printListStudent(studentGroup);

        // StudentGroupService service = new StudentGroupService(studentGroup);
        // printListStudent(service.getSortedStudentGroup());

        

        // System.out.println(student1.compareTo(student5));

    }

    static void printListStudent(Flow flow){
        /*цикл для Iteratora */
        // while (iterator.hasNext())
        //    System.out.println(iterator.next());

        /*цикл для Iterable */
       for (StudentGroup object : flow) {
        System.out.println(object);
        
       }
    }
}