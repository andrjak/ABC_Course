package inter;

import lexer.*;
import symbols.*;

// Одно операндный аналог класса Arith
public class Unary extends Op
{
    public Expr expr;

    // Обрабатывает унарный минус
    public Unary(Token token, Expr x)
    {
        super(token, null);
        expr = x;
        type = Type.max(Type.Int, expr.type);
        if (type == null) error("type error");
    }
    public Expr gen()
    {
        return new Unary(op, expr.reduce());
    }
    public String toString()
    {
        return op.toString() + " " + expr.toString();
    }
}
