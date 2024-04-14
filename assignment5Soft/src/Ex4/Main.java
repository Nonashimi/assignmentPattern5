package Ex4;

class Character {
    String name;
    String characterClass;
    Weapon weapon;
    int health;
    int mana;

    public Character(String name, String characterClass, Weapon weapon, int health, int mana) {
        this.name = name;
        this.characterClass = characterClass;
        this.weapon = weapon;
        this.health = health;
        this.mana = mana;
    }
}

class Weapon {
    String type;
    int damage;
    int speed;
    int range;

    public Weapon(String type, int damage, int speed, int range) {
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
    }
}

abstract class CharacterFactory {
    public abstract Character createCharacter();
    public abstract Weapon createWeapon();
}

class WarriorSwordFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Character("Warrior", "Warrior", createWeapon(), 100, 50);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Sword", 20, 10, 5);
    }
}

class MageStaffFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Character("Mage", "Mage", createWeapon(), 80, 100);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Staff", 15, 8, 10);
    }
}

class ArcherBowFactory extends CharacterFactory {
    @Override
    public Character createCharacter() {
        return new Character("Archer", "Archer", createWeapon(), 90, 70);
    }

    @Override
    public Weapon createWeapon() {
        return new Weapon("Bow", 18, 12, 15);
    }
}

class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter() {
        return factory.createCharacter();
    }
}

public class Main {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();

        creator.setFactory(new WarriorSwordFactory());
        Character warrior = creator.createCharacter();

        creator.setFactory(new MageStaffFactory());
        Character mage = creator.createCharacter();

        creator.setFactory(new ArcherBowFactory());
        Character archer = creator.createCharacter();
    }
}
