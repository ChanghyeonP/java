package poly.car1;

public interface Car {
    void startEngine();
    void offEngine();
    void pressAccelerator();
}
/*
public abstract키워드 생략이 권장된다.
인터페이스에서 메버 변수는 public, static, final이 모두 포함되었다고 간주된다.(상수)
implements키워드를 사용한다.
*/