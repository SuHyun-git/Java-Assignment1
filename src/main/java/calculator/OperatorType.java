package calculator;

public enum OperatorType  {
    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/'),
    MOD('%');

    private final char label;

    OperatorType (char label) {
        this.label = label;
    }

    public char label() {
        return label;
    }

}
