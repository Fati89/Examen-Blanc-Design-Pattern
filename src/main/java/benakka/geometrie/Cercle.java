package benakka.geometrie;

import benakka.observer.ComponentObserver;
import benakka.observer.Observable;

public class Cercle extends ComponentObserver {

    private Point centre;
    private int R;

    public Cercle(String name, Point centre, int r) {
        super(name);
        this.centre = centre;
        R = r;
    }

    @Override
    public double calculePerimetre() {
        return 2*Math.PI* R;
    }

    @Override
    public double calculeSurface() {
        return R * R *Math.PI;
    }

    @Override
    public void dessiner(){
        super.dessiner();
        System.out.println("Centre : "+centre.toString());
        System.out.println("Rayon : "+ R);
    }

    @Override
    public void update(Observable o) {
        System.out.println("Cercle "+name+" is notified that state is updated");
    }
}
