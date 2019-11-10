package inter;

import lexer.*;
import symbols.*;

public class Op extends Expr
{
    public Op(Token token, Type p)
    {
        super(token, p);
    }
    // используется для операций
    public Expr reduсe()
    {
        Expr x = gen();
        Temp t = new Temp(type);
        emit(t.toString() + " = " + x.toString());
        return t;
    }
}
