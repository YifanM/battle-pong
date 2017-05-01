public class GameObject {
    private String name;
    private String colour;
    private String shape;
    private int x;
    private int y;
    private int width;
    private int height;

    public GameObject(String name, String colour, String shape, int x, int y, int width, int height) {
        this.name = name;
        this.colour = colour;
        this.shape = shape;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getColour() {
        return this.colour;
    }
}
