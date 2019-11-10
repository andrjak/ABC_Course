package inter;

import symbols.*;

public class If extends Stmt
{
    Expr expr;
    Stmt stmt;

    public If(Expr x, Stmt s)
    {
        expr = x;
        stmt = s;
        if (expr.type != Type.Bool)
            expr.error("boolean required in if");
    }

    public void gen(int b, int a)
    {
        int label = newlabel(); // Метка кода инструкции
        expr.jumping(0, a);  // Проходим при значении
        // true, переход к метке а при значении false
        emitlabel(label);
        stmt.gen(label, a);
    }
}
