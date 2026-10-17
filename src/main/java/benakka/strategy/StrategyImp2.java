package benakka.strategy;

import benakka.geometrie.Figure;

import java.util.List;

public class StrategyImp2 implements Strategy{
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("traitement 2 sur perimetre ...");
        double p = 0;
        for(Figure f:figures){
            p+=f.calculePerimetre();
        }
        System.out.println("Preimetre totale: "+p);
    }
}
