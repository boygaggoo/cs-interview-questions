package api;

import java.util.Arrays;

public final class GraphNode<T> {
    public T value;
    public GraphNode<T> next;
    public GraphNode<T>[] neighbors;
    public boolean visited;

    public GraphNode() {
    }

    public GraphNode(T value) {
        this.value = value;
    }

    public GraphNode(T value, GraphNode<T>[] neighbors) {
        this.value = value;
        this.neighbors = neighbors;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final GraphNode<?> graphNode = (GraphNode<?>) object;

        if (visited != graphNode.visited) {
            return false;
        }

        if (value != null ? !value.equals(graphNode.value) : graphNode.value != null) {
            return false;
        }

        if (next != null ? !next.equals(graphNode.next) : graphNode.next != null) {
            return false;
        }

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(neighbors, graphNode.neighbors);
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(neighbors);
        result = 31 * result + (visited ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
            "value=" + value +
            ", next=" + next +
            ", neighbors=" + Arrays.toString(neighbors) +
            ", visited=" + visited +
            '}';
    }
}
