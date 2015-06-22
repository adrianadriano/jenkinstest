public enum Id {
    AAA("aaa"),
    BBB("bbb"),
    CCC("ccc");

    private final String value;

    Id(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
