import java.util.Collections;
import java.util.List;

public class FlowService  {

    public void sortFlowService(List<Flow>flows){
        Collections.sort(flows,new FlowComparator());

    }  
}
