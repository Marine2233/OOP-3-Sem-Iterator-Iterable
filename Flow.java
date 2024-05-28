import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<StudentGroup> {
    
    private List<StudentGroup>list;

    public Flow(List<StudentGroup> list) {
        this.list = list;
    }

    public List<StudentGroup> getList() {
        return list;
    }

    public void addStudentGroup(StudentGroup sGroup){
        list.add(sGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new IteratorFlow(this);
    }
}
