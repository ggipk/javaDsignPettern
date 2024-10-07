package adapter;

/**
 * 아답터 패턴
 * 변경 하지 못하는 클래스를 원하는 형태의 클래스나 인터페이스를 도입하여 사용할 수 있게 해주는 패턴
 */
public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

}
