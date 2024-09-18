package iterator;

public interface Iterator {
    boolean next();// aggregator의 구성을 받을 수있으면 진행 아니면 멈춤
    Object current(); //구성 데이터를 하나 얻어 반환
}
