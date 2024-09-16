import java.awt.Color;

public class Tree {

    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;

    // Class Member
    static Color TRUNK_COLOR = Color.MAGENTA;

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow(){
        this.heightFt += 10;
        this.trunkDiameterInches += 1;
    }

    void announceHeight(){
        System.out.println("This "+ this.treeType + " Tree is " + this.heightFt + " tall");
    }

    static void announceColor(){
        System.out.println("The color of the Tree is " + TRUNK_COLOR);
    }

}
