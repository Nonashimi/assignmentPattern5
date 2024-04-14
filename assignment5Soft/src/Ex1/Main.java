package Ex1;

import java.util.ArrayList;
import java.util.List;

class Character {
    String name;
    Object appearance;
    List<Object> abilities;
    List<Object> equipment;
    Object attributes;

    public Character(String name) {
        this.name = name;
        abilities = new ArrayList<>();
        equipment = new ArrayList<>();
    }
}

abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
}

class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.appearance = new WarriorAppearance("Red", "Heavy", "Helmet");
        character.abilities.add(new WarriorAbilities());
        character.equipment.add(new WarriorEquipment(new ArrayList<String>()));
        character.attributes = new WarriorAttributes(10, 5, 8);
        return character;
    }
}

class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.appearance = new MageAppearance("Blue", "Silk", "Pointed Hat");
        character.abilities.add(new MageAbilities());
        character.equipment.add(new MageEquipment());
        character.attributes = new MageAttributes();
        return character;
    }
}

class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        Character character = new Character(name);
        character.appearance = new ArcherAppearance("blue" , "sdf" , "sfdvfb");
        character.abilities.add(new ArcherAbilities());
        character.equipment.add(new ArcherEquipment());
        character.attributes = new ArcherAttributes();
        return character;
    }
}

class CharacterCreator {
    private CharacterFactory factory;

    public void setFactory(CharacterFactory factory) {
        this.factory = factory;
    }

    public Character createCharacter(String name, CharacterFactory warriorFactory) {
        return factory.createCharacter(name);
    }


}
class WarriorAppearance {
    private String color;
    private String armorType;
    private String helmetType;

    public WarriorAppearance(String color, String armorType, String helmetType) {
        this.color = color;
        this.armorType = armorType;
        this.helmetType = helmetType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public String getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(String helmetType) {
        this.helmetType = helmetType;
    }
}

class WarriorAbilities {
    private List<String> abilities;

    public WarriorAbilities() {
        this.abilities = abilities;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    public void removeAbility(String ability) {
        abilities.remove(ability);
    }
}

class WarriorEquipment {
    private List<String> equipment;

    public WarriorEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void addEquipment(String item) {
        equipment.add(item);
    }

    public void removeEquipment(String item) {
        equipment.remove(item);
    }
}

class WarriorAttributes {
    private int strength;
    private int agility;
    private int stamina;

    public WarriorAttributes(int strength, int agility, int stamina) {
        this.strength = strength;
        this.agility = agility;
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
class MageAppearance {
    private String color;
    private String robeType;
    private String hatType;

    public MageAppearance(String color, String robeType, String hatType) {
        this.color = color;
        this.robeType = robeType;
        this.hatType = hatType;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRobeType() {
        return robeType;
    }

    public void setRobeType(String robeType) {
        this.robeType = robeType;
    }

    public String getHatType() {
        return hatType;
    }

    public void setHatType(String hatType) {
        this.hatType = hatType;
    }
}

class MageAbilities {
    private List<String> abilities;

    public MageAbilities() {
        this.abilities = new ArrayList<>();
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    public void removeAbility(String ability) {
        abilities.remove(ability);
    }
}

class MageEquipment {
    private List<String> equipment;

    public MageEquipment() {
        this.equipment = new ArrayList<>();
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void addEquipment(String item) {
        equipment.add(item);
    }

    public void removeEquipment(String item) {
        equipment.remove(item);
    }
}

class MageAttributes {
    private int intellect;
    private int mana;
    private int spellPower;

    public MageAttributes(int intellect, int mana, int spellPower) {
        this.intellect = intellect;
        this.mana = mana;
        this.spellPower = spellPower;
    }

    public MageAttributes() {

    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
class ArcherAppearance {
    private String color;
    private String clothingType;
    private String bowType;

    public ArcherAppearance(String color, String clothingType, String bowType) {
        this.color = color;
        this.clothingType = clothingType;
        this.bowType = bowType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClothingType() {
        return clothingType;
    }

    public void setClothingType(String clothingType) {
        this.clothingType = clothingType;
    }

    public String getBowType() {
        return bowType;
    }

    public void setBowType(String bowType) {
        this.bowType = bowType;
    }
}

class ArcherAbilities {
    private List<String> abilities;

    public ArcherAbilities() {
        this.abilities = new ArrayList<>();
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void addAbility(String ability) {
        abilities.add(ability);
    }

    public void removeAbility(String ability) {
        abilities.remove(ability);
    }
}

class ArcherEquipment {
    private List<String> equipment;

    public ArcherEquipment() {
        this.equipment = new ArrayList<>();
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void addEquipment(String item) {
        equipment.add(item);
    }

    public void removeEquipment(String item) {
        equipment.remove(item);
    }
}

class ArcherAttributes {
    private int agility;
    private int precision;
    private int stamina;

    public ArcherAttributes() {
        this.agility = agility;
        this.precision = precision;
        this.stamina = stamina;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}




public class Main {
    public static void main(String[] args) {
        CharacterCreator creator = new CharacterCreator();
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();

        Character player1 = creator.createCharacter("Warrior", warriorFactory);
        Character player2 = creator.createCharacter("Mage", mageFactory);

        System.out.println("Player 1:");
        printCharacterInfo(player1);
        System.out.println("\nPlayer 2:");
        printCharacterInfo(player2);
    }
    private static void printCharacterInfo(Character character) {
        System.out.println("Name: " + character.name);
        System.out.println("Appearance: " + character.appearance);
        System.out.println("Abilities: " + character.abilities);
        System.out.println("Equipment: " + character.equipment);
        System.out.println("Attributes: " + character.attributes);
    }
}
