package knowleges;

import student.Student;
import student.Task;

import java.util.ArrayList;
import java.util.List;

public class SelfLearning implements Educable {

    private List<Task> tasks;

    public void addTask(Task task) {
        if (this.tasks == null) this.tasks = new ArrayList<>();
        this.tasks.add(task);
    }

    @Override
    public void educate(Student student, int educationDays) {
        for (Task task : tasks) {
            student.addTask(task);
            student.addTheoreticalExperience(1 * educationDays);
            student.addPracticalExperience(task.getHardLevel() * educationDays);
        }
    }
}
