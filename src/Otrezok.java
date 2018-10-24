public class Otrezok extends Figure {

    Point p1, p2;

    public Otrezok(Point q1, Point q2) {
        p1=q1;
        p2=q2;
    }
    @Override
    public String toString(){
        return "(" + p1 + "; " + p2 + ")";
    }
    @Override
    public double perimetr (){
        return p1.length(p2);
    }

    @Override
    public double square() throws GeometricException {
        throw new GeometricException();
    }
}
