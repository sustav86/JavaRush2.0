package task36.task3604;

/**
 * Created by ukr-sustavov on 17.08.2017.
 */
public class RedBlackTree {
    private static final Node EMPTY = new Node(0);

    static {
        EMPTY.left = EMPTY;
        EMPTY.right = EMPTY;
    }

    protected Node current;
    private Node parent;
    private Node grand;
    private Node great;
    private Node header;

    public RedBlackTree() {
        header = new Node(Integer.MIN_VALUE);
        header.left = EMPTY;
        header.right = EMPTY;
    }

    public boolean isEmpty() {
        return header.right == EMPTY;
    }

    public void clear() {
        header.right = EMPTY;
    }

    public void insert(int item) {
        current = grand = parent = header;
        EMPTY.element = item;
        while (current.element != item) {
            great = grand;
            grand = parent;
            parent = current;
            current = item < current.element ? current.left : current.right;

            if (current.left.color == Color.RED && current.right.color == Color.RED) {
                reorient(item);
            }
        }

        if (current != EMPTY) {
            return;
        }

        current = new Node(item, EMPTY, EMPTY);

        if (item < parent.element) {
            parent.left = current;
        } else {
            parent.right = current;
        }

        reorient(item);
    }

    protected void reorient(int item) {
        current.color = Color.RED;
        current.left.color = Color.BLACK;
        current.right.color = Color.BLACK;

        if (parent.color == Color.RED) {
            grand.color = Color.RED;
            if (item < grand.element != item < parent.element) {
                parent = rotate(item, grand);
            }
            current = rotate(item, great);
            current.color = Color.BLACK;
        }

        header.right.color = Color.BLACK;
    }

    private Node rotate(int item, Node parent) {
        if (item < parent.element) {
            Node node = parent.left;
            Node resultNode = item < node.element ? rotateWithLeftNode(node) : rotateWithRightNode(node);
            parent.left = resultNode;
            return parent.left;
        } else {
            Node node = parent.right;
            Node resultNode = item < node.element ? rotateWithLeftNode(node) : rotateWithRightNode(node);
            parent.right = resultNode;
            return parent.right;
        }
    }

    private Node rotateWithLeftNode(Node element) {
        Node left = element.left;
        element.left = left.right;
        left.right = element;
        return left;
    }

    private Node rotateWithRightNode(Node element) {
        Node right = element.right;
        element.right = right.left;
        right.left = element;
        return right;
    }

    public static enum Color {
        BLACK,
        RED
    }

    public static Node getEMPTY() {
        return EMPTY;
    }

    public Node getCurrent() {
        return current;
    }

    public Node getParent() {
        return parent;
    }

    public Node getGrand() {
        return grand;
    }

    public Node getGreat() {
        return great;
    }

    public Node getHeader() {
        return header;
    }

    public static class Node {
        private int element;
        private Node left;
        private Node right;
        private Color color;

        public Node(int element) {
            this(element, null, null);
        }

        public Node(int element, Node left, Node right) {
            this.left = left;
            this.right = right;
            this.element = element;
            this.color = Color.BLACK;
        }


        public int getElement() {
            return element;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public Color getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", left=" + left +
                    ", right=" + right +
                    ", color=" + color +
                    '}';
        }
    }
}
