package uts.vatma.tasks;

public class Agenda {
    private int id;
    private String name;
    private String description;

    public Agenda(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}