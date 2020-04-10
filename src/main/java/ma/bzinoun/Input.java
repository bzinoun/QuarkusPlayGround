package ma.bzinoun;

import java.util.Objects;

import javax.validation.constraints.NotBlank;

public class Input {

    @NotBlank(message="name should not be blank")
    String name ; 

    public Input() { 
    }

    public Input(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Input name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Input)) {
            return false;
        }
        Input input = (Input) o;
        return Objects.equals(name, input.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            "}";
    }

}