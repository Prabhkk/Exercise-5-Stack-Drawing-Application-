import java.util.Stack;

public class DrawingApplication {
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public DrawingApplication() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void addActionToUndoStack(Action action) {
        undoStack.push(action);
        redoStack.clear(); // Clear redo stack when a new action is added to the undo stack
    }

    public Action undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return null;
        }
        Action action = undoStack.pop();
        redoStack.push(action);
        return action;
    }
