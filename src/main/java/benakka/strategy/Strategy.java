package benakka.strategy;

import benakka.geometrie.Figure;

import java.util.List;

public interface Strategy {
    public void traiter(List<Figure> figures);
}
