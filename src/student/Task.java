package student;

public class Task {
    private int hardLevel;
    private String description;

    public Task(int hardLevel, String description) {
        this.hardLevel = hardLevel;
        this.description = description;
    }

    public int getHardLevel() {
        return hardLevel;
    }

    public void setHardLevel(int hardLevel) {
        this.hardLevel = hardLevel;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "hardLevel=" + hardLevel +
                ", description='" + description + '\'' +
                '}';
    }
}
