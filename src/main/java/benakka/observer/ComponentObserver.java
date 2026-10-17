package benakka.observer;

import benakka.auther.Parametrage;

public abstract class ComponentObserver {
    protected Parametrage parametrage;
    protected String name;

    public ComponentObserver(String name) {
        this.name = name;
    }


    public void setParametrage(Parametrage parametrage) {
        this.parametrage = parametrage;
    }

    public abstract void update(Observable o);
    public abstract double calculePerimetre();
    public abstract double calculeSurface();
    public void dessiner(){
        System.out.println("------ DESSIN DE ("+this.name+") ------");
        parametrage.afficherEtat();
    };
}
