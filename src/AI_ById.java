package src;

import java.util.Comparator;

public class AI_ById implements Comparator<AI_Employee> {
    @Override
    public int compare(AI_Employee o1, AI_Employee o2) {

        return o1.getId().compareTo(o2.getId());
    }
}
