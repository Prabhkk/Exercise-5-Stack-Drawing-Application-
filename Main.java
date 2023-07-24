public class Main {
    public static void main(String[] args) {
        DrawingApplication app = new DrawingApplication();

        // Add actions to the undo stack
        Action action1 = new Action("draw", "circle", "x=100", "y=150", "radius=50");
        Action action2 = new Action("move", "circle", "dx=20", "dy=-30");
        Action action3 = new Action("resize", "rectangle", "width=200", "height=100");
        app.addActionToUndoStack(action1);
        app.addActionToUndoStack(action2);
        app.addActionToUndoStack(action3);

        // Print the most recent action without removing it
        System.out.println(" Most recent action (without removing):");
        app.printMostRecentAction();

        // Perform undo and redo actions
        app.undo();
        System.out.println("\n Printing most recent action (After undo action):");
        app.printMostRecentAction();

        app.redo();
        System.out.println("\n Printing most recent action (After redo action):");

        app.printMostRecentAction();
    }
}
