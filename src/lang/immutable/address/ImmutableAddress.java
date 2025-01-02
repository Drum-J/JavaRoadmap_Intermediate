package lang.immutable.address;

/**
 * 이렇게 모든 필드가 final이고 getter 메서드가 존재하면
 * IDE가 record 클래스로 바꾸라고 알려준다.
 */
public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
