package adapter;

public class Assignment {

    private Pen pen;

    public void writeAssignment(String str){
        pen.write(str);
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    
}
