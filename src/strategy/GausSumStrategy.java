package strategy;

public class GausSumStrategy implements SumStrategy{
    @Override
    public int get(int N) {
        return (N+1)*N/2;
    }
}
