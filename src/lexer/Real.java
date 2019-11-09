package lexer;

// Для работы с числами с плавающей точкой
public class Real extends Token
{
    public final float value;

    public Real(float value)
    {
        super(Tag.REAL);
        this.value = value;
    }

    public String toString()
    {
        return "" + value;
    }
}
