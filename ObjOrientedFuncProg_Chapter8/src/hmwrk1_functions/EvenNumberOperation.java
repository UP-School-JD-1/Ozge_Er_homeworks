package hmwrk1_functions;

import java.util.function.Function;

public class EvenNumberOperation {

    public void doOperation(Function function, int a) {
        if (a % 2 == 0)
            System.out.println(function.apply(a));
    }
}