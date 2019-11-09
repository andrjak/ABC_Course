package symbols;

import lexer.Tag;

public class Array extends Type
{
    public Type of; // Массив типа *of*
    public int size = 1; // Количество элементов

    public Array(int size, Type p)
    {
        super("[]", Tag.INDEX, size * p.width); // Выделение памяти
        this.size = size;
        of = p;
    }

    public String toString()
    {
        return "[" + size + "] " + of.toString();
    }
}
