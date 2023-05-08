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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room room)) return false;

        if (!getName().equals(room.getName())) return false;
        return getType().equals(room.getType());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getType().hashCode();
        return result;
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
