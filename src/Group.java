import java.util.Objects;

public class Group<V> {
    private V name;

    public Group(V name) {
        this.name = name;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }

    public V getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        Group o = (Group) obj;
//        return name.equals(o.name);
//    }

    @Override
        public String toString() {
            return "" + name + " /";
        }
}
