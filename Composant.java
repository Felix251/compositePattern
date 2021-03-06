public abstract class Composant {

    private int level;
    private String name;

    public Composant(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void Show();
    
    public int getLevel() {
        return this.level;
    }
    public String getName() {
        return this.name;
    }
    
}
