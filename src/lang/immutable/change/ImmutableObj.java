package lang.immutable.change;

public record ImmutableObj(int value) {

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
    }
}
