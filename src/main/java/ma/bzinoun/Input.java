package ma.bzinoun;

import java.util.Objects;

public class Input {
String input ; 

    public Input() {
    }

    public Input(final String input) {
        this.input = input;
    }

    
    public String getInput() {
        return this.input;
    }

    public void setInput(final String input) {
        this.input = input;
    }

    public Input input(final String input) {
        this.input = input;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(input);
    }

    @Override
    public String toString() {
        return "{" +
            " input='" + getInput() + "'" +
            "}";
    }

}