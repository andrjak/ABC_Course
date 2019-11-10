package inter;

import  lexer.*;
import symbols.*;

public class Constant extends Expr
{
    public static final Constant
        True = new Constant(Word.True, Type.Bool),
        False = new Constant(Word.False, Type.Bool);

    public Constant(Token token, Type p)
    {
        super(token, p);
    }

    public Constant(int i)
    {
        super(new Num(i), Type.Int);
    }

    public void jumping(int t, int f) // Генерация переходов
    {
        if (this == True && t != 0)
            emit("goto L" + t);
        else if (this == False && f != 0)
            emit("goto L" + f);
    }
}
