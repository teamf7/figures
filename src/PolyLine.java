package my.figures;

import java.util.List;

public class PolyLine extends AbstractMnog implements IFigure {

    public PolyLine(List<point> p){
        super(p);
    }

    @Override
    public String toString(){
        String allPoints = "";
        for(int i = 0; i< points.size(); i++){
            allPoints = allPoints + points.get(i).toString() +  " ";
        }
        return allPoints;
    }

    @Override
    public double perimeter(){
        double s=0;
        for (int i = 0; i< points.size()-1; i++){
            point p1,p2;
            p1= points.get(i);
            p2= points.get(i+1);
            s+=p1.length(p2);
                 }
        return s;
    }



    @Override
    public double square() throws GeometricException {
        throw new GeometricException();
    }

    @Override
    public void deletePoint(point p) {
        
    }
}
