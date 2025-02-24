import ra.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Color color = new Color();
        IColorAble.display();
        Moveable move = ()->{

        };
        IColorAble colorAble = (a)->{
            System.out.println("show color: " + a);
        };
        Calculator cal = new Calculator();
        ICalculator calculator = Calculator::new;

        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        list.forEach(System.out::println);
        // bính phương các so có trong list và in ra cac số chia 3 dư 1 sau khi đã bình phương
//        Stream<Integer> stream1 = list.stream();// chuyển collection thành Stream
//        stream1.
//        Stream<Integer> stream2 = stream1.map((t)->t*t); // thao tác trung gian biến các phàn tử trong Stream 1 thành bình phương của có
//        stream2.forEach(System.out::println);

    }
}