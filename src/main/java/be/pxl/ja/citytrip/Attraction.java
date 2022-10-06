package be.pxl.ja.citytrip;

public class Attraction implements Comparable<Attraction> {
    private final int rating;
    private final double days;
    private String name;

    public Attraction(String name, double days, int rating) {
        setName(name);
        this.rating = rating;
        this.days = days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return days;
    }


    @Override
    public int compareTo(Attraction o) {
        return Integer.compare(o.rating, this.rating);
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "rating=" + rating +
                ", days=" + days +
                ", name='" + name + '\'' +
                '}';
    }
}
