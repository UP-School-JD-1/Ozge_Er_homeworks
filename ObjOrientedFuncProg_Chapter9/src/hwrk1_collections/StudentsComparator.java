package hwrk1_collections;
import java.util.Comparator;

public class StudentsComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Students s1=(Students) o1;
        Students s2=(Students) o2;
        if(s1.getNo()<s2.getNo()){
            return -1;
        }
        else if (s1.getNo()>s2.getNo()){
            return 1;
        }
        return 0;
    }
}
