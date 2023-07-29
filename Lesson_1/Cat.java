public class Cat {
    private String filename = null;
    private int weight = 8;
    private int age = 5;
    private String name = null;
    private String adress = null;
    private String color = "Black";

    public void initialize(String name) {
        this.filename = name;
    }

    public void initialize(String name, int weight, int age) {
        this.filename = name + weight + age;
    }

    public void initialize(String name, int age) {
        this.filename = name + age;
    }

    public void initialize(int weight, String color) {
        this.filename = weight + color;
    }

    public void initialize(int weight, String color, String adress) {
        this.filename = weight + color + adress;
    }
}
