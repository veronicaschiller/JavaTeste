
import java.time.LocalDate;

public class Task {

    private String title;
    private String description;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescripton(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate() {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markASCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return "titulo" + title + "\n"
                + "descrição: " + (description.isEmpty() ? "nenhuma" : description) + "\n"
                + "Data de conclusão: " + dueDate.toString() + "\n" +
                "status: " + (isCompleted ? "completo" : "incompleto");
    }

}
