package final1;

public class ConstructInit {
    // 초기값이 없는 경우 생성자 가능
    private final int value;

    public ConstructInit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

