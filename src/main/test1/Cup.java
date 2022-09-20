import java.util.Objects;

public class Cup implements Comparable {

    private String color;
    private int size;

    public Cup(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cup cup = (Cup) o;
        return size == cup.size && Objects.equals(color, cup.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }

    @Override
    public String toString() {
        return "Cup{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.size > ((Cup) o).size? 1 : -1; // comparator for TreeSet (for int)
// or //   return this.size - ((Cup) o).size;

        //return this.color.compareTo(((Cup) o).color);  // (for String)
    }
}
