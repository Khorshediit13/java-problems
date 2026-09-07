package task.scheduling.optimizer;

import java.util.Scanner;

public class ScheduleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int totalTasks = scanner.nextInt();

        Task[] tasks = new Task[totalTasks];

        System.out.println("Enter Task Name, Deadline, and Reward for each:");
        for (int i = 0; i < totalTasks; i++) {
            char name = scanner.next().charAt(0);
            int deadline = scanner.nextInt();
            int reward = scanner.nextInt();
            tasks[i] = new Task(name, deadline, reward);
        }

        TaskScheduler scheduler = new TaskScheduler();
        scheduler.optimizeSchedule(tasks);

        scanner.close();
    }
}