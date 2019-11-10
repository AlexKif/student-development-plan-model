package knowleges;


import student.Student;
import student.Task;

import java.util.ArrayList;
import java.util.List;

public class Internship implements Educable {

    private List<Task> tasks;

    public void addTask(Task task) {
        if (this.tasks == null) this.tasks = new ArrayList<>();
        this.tasks.add(task);
    }

    @Override
    public void educate(Student student, int educationDays) {
        if (!student.isAbiturient()) return;
        for (Task task : tasks) {
            int hardLevel = task.getHardLevel() * 2;
            task.setHardLevel(hardLevel);

            student.addTask(task);
            student.addTheoreticalExperience(1 * educationDays);
            student.addPracticalExperience(hardLevel * educationDays);
        }
    }
}
