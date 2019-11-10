package inter;

import  lexer.*;
import symbols.*;

public class Not extends Logical
{
    public Not(Token token, Expr x)
    {
        super(token, x, x); // Так как Not - унарный логический оператор
    }

    public void jumping(int t, int f)
    {
        expr2.jumping(f, t);
    }

    public String toString()
    {
        return op.toString();
    }
}
