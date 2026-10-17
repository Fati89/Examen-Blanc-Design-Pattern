package benakka.strategy;

import benakka.geometrie.Figure;

import java.util.List;

public class StrategyImpDefault implements Strategy{
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("traitement par defaut ...");
        System.out.println("nombre de figures : "+figures.toArray().length);
    }
}
