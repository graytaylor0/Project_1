package project1.antlr4;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jetbrains.annotations.NotNull;
import project1.Dbms;
import java.util.List;
import project1.antlr4.rulesBaseListener;

public class MyRulesBaseListener extends rulesBaseListener {
    public MyRulesBaseListener() {
        Dbms myDbms = new Dbms();
    }
    @Override public void exitShow_cmd(rulesParser.Show_cmdContext ctx) {
        System.out.println("SHOW");
    }
    public void enterCommand(rulesParser.CommandContext ctx) {//<!-- -->
        // Enters a subtree where the parser rule cmd is the root
        List<ParseTree> children = ctx.children; // grabs the children nodes
        ParseTree first_child = children.get(0);



        String x = first_child.getText();
        int num = first_child.getChildCount();
        // If num is 0, the node is a leaf node
        //System.out.println(x);
        //System.out.println(first_child.toStringTree());
        //System.out.println(first_child.getChild(0));
        for (int i = 0; i < first_child.getChildCount(); i++) {
            //System.out.println(first_child.getChild(i));
        }
        // Assume that the second child is not a leaf node
        /*ParseTree second_child = children.get(1);
        ParseTree subtree_first_child = second_child.getChild(0);
        String y = subtree_first_child.getText();
        //System.out.println(y);
         */
        // Put the extracted information in the listener's DBMS object
        //dbms.some_function(x, y);
    }
}

