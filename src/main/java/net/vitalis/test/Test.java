package net.vitalis.test;

public class Test {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return (this.id == null);
    }
}
