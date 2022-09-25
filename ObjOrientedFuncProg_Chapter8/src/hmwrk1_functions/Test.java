package hmwrk1_functions;
import java.util.function.Function;

public class Test {
     static int addition = 0;
     static int multiplication = 1;
    public static void main(String[] args) {

        EvenNumberOperation EvenNum = new EvenNumberOperation();
//        Test t=new Test();
        Function<Integer, Integer> productFunc = i -> multiplication*= i;
        Function<Integer, Integer> sumFunc = i -> addition += i;
        Function<Integer, Integer> squareFunc = i -> i * i;

        EvenNum.doOperation(productFunc, 12);
        EvenNum.doOperation(sumFunc, 16);
        EvenNum.doOperation(squareFunc, 8);


    }
}
