package inter;

import lexer.*;
import symbols.*;

// Для узлов представляющих выражения
public class Expr extends Node
{
    public Token op; // оператор
    public Type type; // тип

    Expr (Token token, Type p)
    {
        op = token;
        type = p;
    }

    // Возвращает "член", который находится в правой части 3 адресной команды
    public Expr gen()
    {
        return this;
    }

    // возвращает константуб идентификатор или временное имя для всего выражения
    public Expr reduce()
    {
        return this;
    }

    // jumping & emitjumps предназначены для генерации логических выражений
    public void jumping (int t, int f)
    {
        emitjumps(toString(), t, f);
    }

    public void emitjumps(String test, int t, int f)
    {
        if (t != 0 && f != 0)
        {
            emit("if" + test + " goto L" + t);
            emit("goto L" + f);
        }
        else if (t != 0)
            emit("if" + test + " goto L" + t);
        else if (f != 0)
            emit("iffalse "+ test + " goto L" + f);
        else;
    }

    public String toString()
    {
        return op.toString();
    }
}
