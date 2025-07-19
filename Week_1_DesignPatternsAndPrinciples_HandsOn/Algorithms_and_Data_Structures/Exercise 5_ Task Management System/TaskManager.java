package task;

public class TaskManager {
    Task head = null;

    public void add(Task t) {
        t.next = head;
        head = t;
    }

    public void traverse() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp.taskName + " - " + temp.status);
            temp = temp.next;
        }
    }

    public void delete(int id) {
        Task temp = head, prev = null;
        while (temp != null && temp.taskId != id) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        if (prev == null) head = head.next;
        else prev.next = temp.next;
    }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.add(new Task(1, "Design UI", "Pending"));
        tm.add(new Task(2, "Fix Bugs", "Completed"));
        tm.traverse();
        tm.delete(2);
        tm.traverse();
    }
}