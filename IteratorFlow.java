import java.util.Iterator;
import java.util.List;

public class IteratorFlow implements Iterator<StudentGroup> {

    private List<StudentGroup>list; 
    private int idx = 0;


    public IteratorFlow(Flow list) {
        this.list = list.getList();
    }

    @Override
    public boolean hasNext() {
        return idx < list.size();
        
    }

    @Override
    public StudentGroup next() {
        if(hasNext())
        return list.get(idx++);
            // return list.get(idx++);
        return null;
    }
    
}
