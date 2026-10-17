package benakka;

import benakka.auther.Dessin;
import benakka.auther.Parametrage;
import benakka.geometrie.Cercle;
import benakka.geometrie.Figure;
import benakka.geometrie.Point;
import benakka.geometrie.Rectangle;
import benakka.observer.ComponentObserver;
import benakka.strategy.StrategyImp1;
import benakka.strategy.StrategyImp2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Parametrage parametrage = new Parametrage(2, 111, 555);

        Figure figure = new Figure("figure 1");
        Figure bigFigure = new Figure("big figure");
        Cercle cercle1 = new Cercle("cercle 1",new Point(1,1), 1);
        Cercle cercle2 = new Cercle("cercle 2",new Point(2,2), 2);
        Rectangle rectangle = new Rectangle("rectangle",new Point(3,3), 3,3);

        figure.setParametrage(parametrage);
        bigFigure.setParametrage(parametrage);

        figure.addComponent(cercle1);
        figure.addComponent(rectangle);
        bigFigure.addComponent(figure);
        bigFigure.addComponent(cercle2);

        parametrage.subscribe(cercle1);
        parametrage.subscribe(cercle2);
        parametrage.subscribe(rectangle);
        parametrage.subscribe(figure);
        parametrage.subscribe(bigFigure);

        Dessin dessin = new Dessin();
        dessin.addFigure(bigFigure);
        dessin.addFigure(figure);
        dessin.afficher();
        System.out.println("");
        dessin.traiter();
        dessin.setStrategy(new StrategyImp1());
        System.out.println("");
        dessin.traiter();
        dessin.setStrategy(new StrategyImp2());
        System.out.println("");
        dessin.traiter();

        System.out.println("\n---test: changer epesseur---");
        parametrage.setEpaisseur(5);

    }
}
