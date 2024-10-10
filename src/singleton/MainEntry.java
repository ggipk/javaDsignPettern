package singleton;

/**
 * 오직 한개의 객체만 생성할 수 있는 패턴 오직 나만 사용해야해!!
 */
public class MainEntry {
    public static void main(String[] args) {
        King king  = King.getInstance();

        king.say();

    }
}
