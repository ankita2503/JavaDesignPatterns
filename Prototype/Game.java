package Prototype;

public class Game implements Cloneable {

    private int id;
    private String name;

    Membership memebership;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMemebership() {
        return memebership;
    }

    public void setMemebership(Membership memebership) {
        this.memebership = memebership;
    }

    //Lead to shallow copy problem of memebership object
/*    @Override
    protected Game clone() throws CloneNotSupportedException {
        return (Game) super.clone();
    }*/

    //Deep copy
    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setMemebership(new Membership());
        return game;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memebership=" + memebership +
                '}';
    }
}
