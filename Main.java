
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("ToDo list");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Lista de tarefas");
            System.out.println("3 - Completar tarefa");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Titulo da tarefa: ");
                    String title = scanner.nextLine();
                    System.out.println("Descrição da tarefa: ");
                    String description = scanner.nextLine();
                    System.out.println("Data da tarefa dd-mm-yyyy");
                    String dueDateString = scanner.nextLine();

                    LocalDate dueDate;
                    try {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy");
                        dueDate = LocalDate.parse(dueDateString, formatter);
                    } catch (DateTimeException e) {
                        System.out.println("Erro data deve estar no formato indicado");
                        break;
                    }

                case 2:

                    System.out.println("lista da tarefa");
                    toDoList.displayTask();
                    break;

                case 3:
                    System.out.println("digite a quantidade de tarefas para completar");
                    int taskNumber = scanner.nextInt();
                    toDoList.markTaskAsCompleted(taskNumber - 1);
                    break;

                case 4:
                    System.out.println("Obrigado espero que suas tarefas sejam completas");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção invalida, tente novamente");
            }
            System.out.println();
        }
    }
}
