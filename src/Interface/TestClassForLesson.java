package Interface;

/**
 * Created by osads on 19.07.2017.
 */
public class TestClassForLesson {

    public static void main(String[] args){
        Pair<String, Integer> p1 = new Pair<>("123", 234);
        Pair<String, Integer> p2 = new Pair<>("456", 567);

        System.out.println(p1.getSecond());

        System.out.println(p2.getSecond() - p1.getSecond());
    }

}
