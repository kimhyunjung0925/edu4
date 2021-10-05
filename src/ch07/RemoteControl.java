package ch07;

public interface RemoteControl {
    int MAX_VOLUME = 10; //public static final 안적어도 자동으로 붙음
    int MIN_VOLUME = 0;

    public abstract void turnOn(); //메소드는 public abstract 안적으도 자동으로 붙음
    public void turnOff();
    abstract void volumeUp();
    void volumeDown();
}
