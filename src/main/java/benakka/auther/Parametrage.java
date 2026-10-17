package benakka.auther;

import benakka.observer.ComponentObserver;
import benakka.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {
    private int epaisseur;
    private int couleurContour;
    private int couleurRemplissage;
    private List<ComponentObserver> observers = new ArrayList<>();

    public Parametrage(int epaisseur, int couleurContour, int couleurRemplissage){
        this.epaisseur = epaisseur;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    public void afficherEtat(){
        System.out.println("Epaisseur : "+epaisseur);
        System.out.println("Couleur Contour : "+couleurContour);
        System.out.println("Couleur Remplissage : "+couleurRemplissage);
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        notifyObservers();
    }

    public int getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
        notifyObservers();

    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        notifyObservers();
    }

    public List<ComponentObserver> getObservers() {
        return observers;
    }

    @Override
    public void subscribe(ComponentObserver c) {
        observers.add(c);
    }

    @Override
    public void unsubscribe(ComponentObserver c) {
        observers.remove(c);
    }

    @Override
    public void notifyObservers() {
        for(ComponentObserver o:observers){
            o.update(this);
        }
    }
}
