package iterator;
//Iterator패턴의 핵심은 배열 안에 무엇이 들어 있는지 공통적으로 알수 있는 패턴을 제공한다.
public class MainEntry {
    public static void main(String[] args) {
        Item[] items = {
                new Item("cpu",1000),
                new Item("java",12000),
                new Item("rem",13000),
                new Item("vCard",14000),
        };
        Array array = new Array(items);

        Iterator it = array.iterator();

        while (it.next()){
            Item item = (Item)it.current();
            System.out.println(item);
        }
    }
}
