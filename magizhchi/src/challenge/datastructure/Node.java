package challenge.datastructure;

import java.util.List;

/**
 * Created by Raj on 8/18/16.
 */
public class Node {

    private String name;
    private List<Node> children;

    public Node(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        return name.equals(node.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
