package inter;

import  lexer.*;
import symbols.*;

public class Access extends Op
{
    public Id array;
    public Expr index;

    public Access(Id a, Expr i, Type p)
    {
        // p - тип элемента после выравнивания массива
        super(new Word("[]", Tag.INDEX), p);
        array = a;
        index = i;
    }

    // Генерация обычного кода
    public Expr gen()
    {
        return new Access(array, index.reduce(), type);
    }

    // Генерация кода с переходами
    public void jumping(int t, int f)
    {
        emitjumps(reduce().toString(), t, f);
    }

    public String toString()
    {
        return array.toString() + " [ " + index.toString() + " ]";
    }
}
