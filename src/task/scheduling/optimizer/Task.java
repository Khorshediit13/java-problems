package task.scheduling.optimizer;

public class Task {
    public char name;
    public int deadline;
    public int reward;

    public Task(char name, int deadline, int reward) {
        this.name = name;
        this.deadline = deadline;
        this.reward = reward;
    }
}