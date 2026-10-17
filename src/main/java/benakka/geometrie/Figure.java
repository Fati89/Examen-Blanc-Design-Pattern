package benakka.geometrie;

import benakka.observer.ComponentObserver;
import benakka.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class Figure extends ComponentObserver {

    private List<ComponentObserver> components = new ArrayList<>();

    public Figure(String name) {
        super(name);
    }

    @Override
    public void dessiner(){
        super.dessiner();
        for (ComponentObserver c:components){
            c.dessiner();
        }
    };

    @Override
    public double calculePerimetre() {
        double perimetre=0;
        for (ComponentObserver c:components){
            perimetre += c.calculePerimetre();
        }
        return perimetre;
    }

    @Override
    public double calculeSurface() {
        double surface=0;
        for (ComponentObserver c:components){
            surface += c.calculeSurface();
        }
        return surface;
    }

    @Override
    public void update(Observable o) {
        System.out.println("Figure "+name+" is notified that state is updated");
    }

    public List<ComponentObserver> getComponents() {
        return components;
    }

    public void addComponent(ComponentObserver c){
        components.add(c);
        c.setParametrage(this.parametrage);
    }
    public void removeComponent(ComponentObserver c){
        components.remove(c);
    }
}
