package inter;

// Промежуточный код для инструкций
// Каждая конструкция реализуется подкласом данного класса
// statement - оператор
public class Stmt extends Node
{
    public Stmt(){}
    public static Stmt Null = new Stmt();

    // Вызывается с метки начала и после конструкции:
    // b начало кода инструкции, a первую команду после кода данной инструкции
    public void gen(int b, int a){}

    int after = 0; // Сохраняет метку после конструкции
                   // Используется для инструкции break:
    public static  Stmt Enclosing = Stmt.Null;
}
