package LinkedinCollections.London;

public class Room {
    private String name;

    private String type;
    private int capacity;
    private double rate;

    public Room(String name, String type, int capacity, Double rate) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
