package entities;

public class Champion {
    private final String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public void takeDamage(Champion other) {
        int damage = Math.max(other.attack - this.armor, 1);
        this.life -= damage;
        if (this.life < 0) {
            this.life = 0;
        }
    }

    public String status() {
        if (life > 0) {
            return name + ": " + life + " de vida";
        } else {
            return name + " morreu";
        }
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}


