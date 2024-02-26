package Week5.class_activity_2a1.model;

public class DecaDevs {
    private String name;
    private boolean isFemale;
    private boolean isMale;

    public DecaDevs(String name, boolean isFemale, boolean isMale) {
        this.name = name;
        this.isFemale = isFemale;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public boolean isMale() {
        return isMale;
    }
}
