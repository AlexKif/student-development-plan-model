import knowleges.Internship;
import knowleges.Meetup;
import knowleges.SelfLearning;
import knowleges.University;
import student.DevPlan;
import student.Task;

import student.Student;

public class Main {
    public static void main(String[] args) {

        University chdtu = new University();
        chdtu.addTask(new Task(1, "chdtu"));

        Meetup meetup = new Meetup();
        meetup.addTask(new Task(2,"meetup"));

        SelfLearning selfLearning = new SelfLearning();
        selfLearning.addTask(new Task(3, "selfLearning"));

        Internship internship = new Internship();
        internship.addTask(new Task(5, "internship"));

        DevPlan devPlan = new DevPlan();
        devPlan.addEducable(chdtu, 5 * 260);
        devPlan.addEducable(meetup, 2 * 50);
        devPlan.addEducable(selfLearning, 5 * 360);
        devPlan.addEducable(internship, 1 * 100);

        Student andrey = new Student(true,1.5);
        andrey.addDevPlan(devPlan);
        andrey.checkResult();
        System.out.println("andrey.getTheoreticalExperience()t = " + andrey);
    }
}
