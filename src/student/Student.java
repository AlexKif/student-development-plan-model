package student;


import knowleges.Educable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {

    private int theoreticalExperience;
    private int practicalExperience;
    private double coefficient;
    private DevPlan devPlan;

    private List<Task> tasks;
    private boolean isAbiturient;
    private boolean isHasLaptop;

    public Student(boolean isAbiturient, double coefficient) {
        this.coefficient = coefficient;
        this.isAbiturient = isAbiturient;
    }

    public Task shareTask(String task){
        for (Task t : tasks) {
            if (t.getDescription().equals(task)) return t;
        }
        return null;
    }

    public void addTask(Task task) {
        if (this.tasks == null) this.tasks = new ArrayList<>();
        this.tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return this.tasks;
    }

    public void addPracticalExperience(int hardLevel) {
        this.practicalExperience += hardLevel;
    }


    public void addTheoreticalExperience(int k) {
        this.theoreticalExperience += k;
    }

    public int getTheoreticalExperience() {
        return theoreticalExperience;
    }

    public boolean isAbiturient() {
        return isAbiturient;
    }

    public boolean isHasLaptop() {
        return isHasLaptop;
    }

    public void addDevPlan(DevPlan devPlan) {
        this.devPlan = devPlan;
    }

    public void checkResult() {
        Map<Educable, Integer> educables = devPlan.getEducables();
        for (Map.Entry<Educable, Integer> entry : educables.entrySet()) {
            Educable educable = entry.getKey();
            int days = entry.getValue();
            educable.educate(this, days);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "theoreticalExperience=" + theoreticalExperience +
                ", practicalExperience=" + practicalExperience +
                ", coefficient=" + coefficient +
                ", devPlan=" + devPlan +
                ", tasks=" + tasks +
                ", isAbiturient=" + isAbiturient +
                ", isHasLaptop=" + isHasLaptop +
                '}';
    }
}
