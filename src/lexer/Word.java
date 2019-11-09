package lexer;

public class Word extends Token
{
    public static final Word
        and = new Word("&&", Tag.AND),
        or = new Word("||", Tag.OR),
        eq = new Word("==", Tag.EQ),
        ne = new Word("!=", Tag.NE),
        le = new Word("<=", Tag.LE),
        ge = new Word(">=", Tag.GE),
        minus = new Word("minus", Tag.MINUS),
        True = new Word("true", Tag.TRUE),
        False = new Word("fale", Tag.FALSE),
        temp = new Word("t", Tag.TEMP);

    public String lexeme = "";

    public Word(String lexem, int tag)
    {
        super(tag);
        this.lexeme = lexem;
    }

    public String toString()
    {
        return lexeme;
    }
}
