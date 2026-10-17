package benakka.geometrie;

import benakka.observer.ComponentObserver;
import benakka.observer.Observable;

public class Rectangle extends ComponentObserver {

    private Point coin;
    private int H;
    private int L;

    public Rectangle(String name, Point coin, int h, int l) {
        super(name);
        this.coin = coin;
        H = h;
        L = l;
    }
    @Override
    public double calculePerimetre() {
        return 2*(H+L);
    }

    @Override
    public double calculeSurface() {
        return H*L;
    }

    @Override
    public void dessiner(){
        super.dessiner();
        System.out.println("Coin : "+coin.toString());
        System.out.println("Largeur : "+L);
        System.out.println("Hauteur : "+H);
    }

    @Override
    public void update(Observable o) {
        System.out.println("Rectangl "+name+" is notified that state is updated");
    }
}
