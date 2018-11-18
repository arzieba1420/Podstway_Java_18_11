import java.awt.*;

public class FourDimPoint extends Point {

    private int z;
    private int w;

    FourDimPoint (){
    }

    FourDimPoint (int x, int y, int z, int w){
        super (x,y);
        this.z = z;
        this.w = w;
    }

    void getCoordinates(){
        System.out.println("x: "+this.x);
        System.out.println("y: "+this.y);
        System.out.println("z: "+this.z);
        System.out.println("w: "+this.w);
    }

    public static void main(String[] args) {
        FourDimPoint fourDimPoint = new FourDimPoint(2,5,6,3);
        fourDimPoint.getCoordinates();
    }
}
