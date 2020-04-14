package ma.bzinoun;

public class Hello {

    String name;

    public Hello() {
    }

    public Hello(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hello name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + "}";
    }

}