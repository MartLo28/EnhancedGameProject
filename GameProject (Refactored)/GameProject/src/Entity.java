public class Entity {
    private long id;
    private String name;

    // Constructor with id and name
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id
    public long getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Override toString to return id and name
    @Override
    public String toString() {
        return "Entity [id=" + id + ", name=" + name + "]";
    }
}
