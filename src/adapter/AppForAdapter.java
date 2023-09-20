package adapter;

public class AppForAdapter {
    public static void main(String[] args) {
        Pen pen = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(pen);
        assignment.writeAssignment("Write some things!");
    }
}
