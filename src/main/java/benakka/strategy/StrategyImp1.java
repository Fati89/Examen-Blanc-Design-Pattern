package benakka.strategy;

import benakka.geometrie.Figure;

import java.util.List;

public class StrategyImp1 implements Strategy{
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("traitement 1 sur surface ...");
        double s = 0;
        for(Figure f:figures){
            s+=f.calculeSurface();
        }
        System.out.println("Surface totale: "+s);
    }
}
