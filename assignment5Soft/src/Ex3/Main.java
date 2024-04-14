package Ex3;

class Furniture {
    String name;
    String style;
    String material;
    float price;

    public Furniture(String name, String style, String material, float price) {
        this.name = name;
        this.style = style;
        this.material = material;
        this.price = price;
    }
}

abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
    public abstract Sofa createSofa();
}

class ModernWoodFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair("Wood", 100);
    }

    @Override
    public Table createTable() {
        return new ModernTable("Wood", 200);
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Wood", 300);
    }
}
class IndustrialSofa extends Sofa {
    public IndustrialSofa(String material, float price) {
        super("Industrial", price);
        this.material = material;
    }
}
class ModernSofa extends Sofa {
    public ModernSofa(String material, float price) {
        super("Modern", price);
        this.material = material;
    }
}



class TraditionalMetalFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new TraditionalChair("Metal", 120);
    }

    @Override
    public Table createTable() {
        return new TraditionalTable("Metal", 220);
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa("Glass", 350);
    }
}

class IndustrialGlassFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new IndustrialChair("Glass", 150);
    }

    @Override
    public Table createTable() {
        return new IndustrialTable("Glass", 250);
    }

    @Override
    public Sofa createSofa() {
        return new IndustrialSofa("Glass", 350);
    }
}
class TraditionalChair extends Chair {
    public TraditionalChair(String material, float price) {
        super("Traditional", price);
        this.material = material;
    }
}
class TraditionalTable extends Table {
    public TraditionalTable(String material, float price) {
        super("Traditional", price);
        this.material = material;
    }
}
class ModernChair extends Chair {
    public ModernChair(String material, float price) {
        super("Modern", price);
        this.material = material;
    }
}
class ModernTable extends Table {
    public ModernTable(String material, float price) {
        super("Modern", price);
        this.material = material;
    }
}
class IndustrialChair extends Chair {
    public IndustrialChair(String material, float price) {
        super("Industrial", price);
        this.material = material;
    }
}
class IndustrialTable extends Table {
    public IndustrialTable(String material, float price) {
        super("Industrial", price);
        this.material = material;
    }
}





class Chair {
    String name;
    String style;
    String material;
    float price;

    public Chair(String style, float price) {
        this.name = "Chair";
        this.style = style;
        this.price = price;
    }
}

class Table {
    String name;
    String style;
    String material;
    float price;

    public Table(String style, float price) {
        this.name = "Table";
        this.style = style;
        this.price = price;
    }
}


class Sofa {
    String name;
    String style;
    String material;
    float price;

    public Sofa(String style, float price) {
        this.name = "Sofa";
        this.style = style;
        this.price = price;
    }
}

class FurnitureCreator {
    private FurnitureFactory factory;

    public void setFactory(FurnitureFactory factory) {
        this.factory = factory;
    }

    public Chair createChair() {
        return factory.createChair();
    }

    public Table createTable() {
        return factory.createTable();
    }

    public Sofa createSofa() {
        return factory.createSofa();
    }
}

public class Main {
    public static void main(String[] args) {
        FurnitureCreator creator = new FurnitureCreator();

        creator.setFactory(new ModernWoodFactory());
        Chair modernWoodChair = creator.createChair();
        Table modernWoodTable = creator.createTable();
        Sofa modernWoodSofa = creator.createSofa();

        creator.setFactory(new TraditionalMetalFactory());
        Chair traditionalMetalChair = creator.createChair();
        Table traditionalMetalTable = creator.createTable();
        Sofa traditionalMetalSofa = creator.createSofa();

        creator.setFactory(new IndustrialGlassFactory());
        Chair industrialGlassChair = creator.createChair();
        Table industrialGlassTable = creator.createTable();
        Sofa industrialGlassSofa = creator.createSofa();
    }
}
