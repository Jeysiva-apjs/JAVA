public class App {
    public static void main(String[] args) throws Exception {
        Tree oakTree = new Tree(110, 12, TreeType.OAK);
        Tree mapleTree = new Tree(90, 10, TreeType.MAPLE);

        oakTree.announceHeight();
        mapleTree.announceHeight();
        Tree.announceColor();
    }
}
