package task.scheduling.optimizer;

import java.util.Arrays;

public class TaskScheduler {

    public void optimizeSchedule(Task[] tasks) {
        Arrays.sort(tasks, (a, b) -> b.reward - a.reward);

        int maxDeadline = 0;
        for (Task task : tasks) {
            if (task.deadline > maxDeadline) {
                maxDeadline = task.deadline;
            }
        }

        char[] plan = new char[maxDeadline];
        boolean[] filled = new boolean[maxDeadline];
        int totalReward = 0;

        for (Task task : tasks) {
            for (int slot = Math.min(maxDeadline, task.deadline) - 1; slot >= 0; slot--) {
                if (!filled[slot]) {
                    filled[slot] = true;
                    plan[slot] = task.name;
                    totalReward += task.reward;
                    break;
                }
            }
        }

        System.out.print("Optimal Task Plan: ");
        for (char taskName : plan) {
            if (taskName != '\0') {
                System.out.print(taskName + " ");
            }
        }
        System.out.println("\nTotal Revenue/Reward = " + totalReward);
    }
}