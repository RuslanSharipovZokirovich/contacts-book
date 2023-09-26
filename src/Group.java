public class Group<V> {
        private V name;

        public Group(V name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "" + name + "";
        }
}
