package headfirst.chapter03.coffee;

public abstract class Beverage {
    String description = "제목 없음";
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
