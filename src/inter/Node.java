package inter;

import lexer.*;

// Узлы синтаксического дерева
public class Node
{
    static int labels = 0;
    int lexline = 0;

    Node()
    {
        lexline = Lexer.line;
    }

    void error(String str)
    {
        throw new Error("near line " + lexline + ": " + str)
    }

    public int newlabel()
    {
        return ++labels;
    }

    public void emitlabel(int i)
    {
        System.out.print("L" + i + ":");
    }

    public void emit(String s)
    {

    }
}
