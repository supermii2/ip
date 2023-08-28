import java.time.LocalDate;

/**
 * Representation of a ToDo task
 * recorded by the chatbot.
 * 
 * @author Alvis Ng (supermii2)
 */
public class TaskTodo extends Task {
    @Override
    public LocalDate getDate() {
        return null;
    }
    /**
     * Creates a todo task.
     * @param taskName Name of task
     */
    TaskTodo(String taskName) {
        super(taskName);
        super.oneLetterAbbrev = "T";
    }
}
