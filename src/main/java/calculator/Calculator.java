package calculator;
import java.util.List;
import java.util.Scanner;

public abstract class Calculator<T> {

    public abstract void inquiryResults(List<T> results);

    public abstract void removeResult(List<T> results);


}

