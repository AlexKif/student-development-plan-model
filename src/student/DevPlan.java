package student;

import knowleges.Educable;

import java.util.HashMap;
import java.util.Map;

public class DevPlan {

    private Map<Educable, Integer> educables;

    public void addEducable(Educable educable, int days) {
        if (educables == null) educables = new HashMap<>();
        this.educables.put(educable, days);
    }

    public Map<Educable, Integer> getEducables() {
        return this.educables;
    }


}
