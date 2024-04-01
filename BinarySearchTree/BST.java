package Trees.BinarySearchTree;

public class BST {
    public static void main(String[] args) {
        BinarySearchTrees tree = new BinarySearchTrees();
        tree.isEmpty();
        tree.insert(50);
        tree.insert(2);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.isEmpty();
        tree.display();
        tree.search(80);

    }
}
