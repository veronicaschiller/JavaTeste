
import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private final List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("tarefa adicionada com succeso!");
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markASCompleted();
            System.out.println("tarefa marcada como completa!");
        }else{
            System.out.println("indice de tarefa invalida");
        }
    }

    public void displayTask() {
        if (tasks.isEmpty()){
            System.out.println("nenhuma tarefa listada");
        }else{
            for(int i = 0; i < tasks.size(); i++) {
                System.out.println("tarefa #" + (i + 1) + ":");
                System.out.println(tasks.get(i));
                System.out.println();
            }
        }
    }

}


