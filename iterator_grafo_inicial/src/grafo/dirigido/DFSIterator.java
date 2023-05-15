package grafo.dirigido;
import java.util.*;

public class DFSIterator<T> implements GrafoIterator<Vertice<T>> {
    private final List<Vertice<T>> vertices;
    private final Queue<Vertice<T>> fila;

    public DFSIterator(List<Vertice<T>> vertices, T carga) {
        this.vertices = vertices;
        this.fila = new LinkedList<>();
        DFS(carga);
    }

    @Override
    public boolean hasNext() {
        return !fila.isEmpty();
    }

    @Override
    public Vertice<T> next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return fila.remove();
    }

    private Vertice<T> getVertice(T carga) {
        for (Vertice<T> u : vertices) {
            if (u.getCarga().equals(carga)) {
                return u;
            }
        }
        return null;
    }

    private void adicionarNaFila(Vertice<T> carga) {
        if (!fila.contains(carga)) {
            fila.add(carga);
        }
    }

    public void DFS(T source) {
        Vertice<T> u;

        if ((u = getVertice(source)) == null) {
            System.err.println("vertice nao encontrado em runDFS()");
            return;
        }

        for (Vertice<T> vertex : vertices) {
            vertex.setStatus(VertexState.Unvisited);
        }

        runDFS(u);
    }

    private void runDFS(Vertice<T> u) {
        Vertice<T> w;
        List<Aresta<T>> uAdjacentes;

        u.setStatus(VertexState.Visited);
        uAdjacentes = u.getAdj();

        for (Aresta<T> arco : uAdjacentes) {
            w = arco.getDestino();
            if (w.getStatus() == VertexState.Unvisited) {
                runDFS(w);
            }
        }
        adicionarNaFila(u);
        u.setStatus(VertexState.Finished);
    }
}
