package lesson7;

public enum PartsBody  {
    HEAD("Head"),
    BODY("Body");

    public String getPart() {
        return part;
    }

    public final String part;

    PartsBody(String part) {
        this.part = part;

    }

}