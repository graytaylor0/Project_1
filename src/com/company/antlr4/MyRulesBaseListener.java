package com.company.antlr4;

import com.company.DBMS;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class MyRulesBaseListener extends rulesBaseListener {
    public MyRulesBaseListener() {
        DBMS myDbms = new DBMS();
    }
    @Override public void exitShow_cmd(rulesParser.Show_cmdContext ctx) {
        System.out.println("SHOW");
    }
    @Override public void enterOperand(rulesParser.OperandContext ctx) {DBMS.terminalNodes.add(ctx.stop.getText());}

    public void enterCommand(rulesParser.CommandContext ctx) {//<!-- -->
        // Enters a subtree where the parser rule cmd is the root
        List<ParseTree> children = ctx.children; // grabs the children nodes
        ParseTree first_child = children.get(0);

        String x = first_child.getText();
        int num = first_child.getChildCount();
        // If num is 0, the node is a leaf node
        // Assume that the second child is not a leaf node
        /*ParseTree second_child = children.get(1);
        ParseTree subtree_first_child = second_child.getChild(0);
        String y = subtree_first_child.getText();
         */
        // Put the extracted information in the listener's DBMS object
        //dbms.some_function(x, y);
    }
}

