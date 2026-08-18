public class Task {
    
  private String title;
  private String priority;
  private String dueDate;
  private boolean completed;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Task(String title, String priority, String dueDate, boolean completed) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
        this.completed = completed;
    }
    
}
