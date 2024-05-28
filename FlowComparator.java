import java.util.Comparator;

public class FlowComparator implements Comparator<Flow> {

    @Override
    public int compare(Flow o1, Flow o2) {
        if (o1.getList().size() == o2.getList().size()) {
            return 0;
        }
        if (o1.getList().size() > o2.getList().size()) {
            return 1;  
        }
        return -1;
        // return Integer.compare(o1.getList().size(),o2.getList().size());
    }
    
}
