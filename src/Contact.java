public class Contact<V, N> {
    private V name;
    private N number;

    public Contact(V name, N number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + name + " -> " + number + "";
    }
}
