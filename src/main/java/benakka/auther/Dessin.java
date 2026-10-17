package benakka.auther;

import benakka.geometrie.Figure;
import benakka.observer.ComponentObserver;
import benakka.strategy.Strategy;
import benakka.strategy.StrategyImpDefault;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> figures = new ArrayList<>();
    private Strategy strategy = new StrategyImpDefault();

    public void traiter() {
        System.out.println("--- TRAINTEMENT ---");
        strategy.traiter(figures);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void addFigure(Figure figure){
        figures.add(figure);
    }
    public void removeFigure(Figure figure){
        figures.remove(figure);
    }
    public void afficher(){
        System.out.println("--- AFFICHAGE ---");
        for(Figure f:figures){
            for(ComponentObserver c:f.getComponents()){
                System.out.println("*************************************");
                c.dessiner();
            }
        }
    }
    public void serialiser(){

    }
}
