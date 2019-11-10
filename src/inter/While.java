package inter;

import symbols.*;

public class While extends Stmt
{
    Expr expr;
    Stmt stmt;

    public While()
    {
        expr = null;
        stmt = null;
    }

    public void gen(int b, int a)
    {
        after = a;  // Сохранение метки a
        expr.jumping(0, a);
        int label = newlabel();  // Метка для stmt
        emitlabel(label);
        stmt.gen(label, b);
        emit("goto L" + b);
    }
}
