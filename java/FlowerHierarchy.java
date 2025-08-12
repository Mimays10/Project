
    // Superclass
class Flowers {
    String name;

    public Flowers(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Flower: " + name);
    }
}

// Subclass of Flowers
class SubtropicalFlowers extends Flowers {
    public SubtropicalFlowers(String name) {
        super(name);
    }
}

// Subclass of Flowers
class TemperateFlowers extends Flowers {
    public TemperateFlowers(String name) {
        super(name);
    }
}

// Specific subclasses of TemperateFlowers
class Bougainvillea extends TemperateFlowers {
    public Bougainvillea() {
        super("Bougainvillea");
    }
}

class Peonies extends TemperateFlowers {
    public Peonies() {
        super("Peonies");
    }
}

class Roses extends TemperateFlowers {
    public Roses() {
        super("Roses");
    }
}

class YellowRoses extends Roses {
    public YellowRoses() {
        super("Yellow Roses");
    }
}

// New subclasses of TemperateFlowers
class Snapdragons extends TemperateFlowers {
    public Snapdragons() {
        super("Snapdragons");
    }
}

class FestivaMaxima extends TemperateFlowers {
    public FestivaMaxima() {
        super("Festiva Maxima");
    }
}

class ShrubRoses extends Roses {
    public ShrubRoses() {
        super("Shrub Roses");
    }
}

class NarcissusCarlton extends TemperateFlowers {
    public NarcissusCarlton() {
        super("Narcissus Carlton");
    }
}

class Foxglove extends TemperateFlowers {
    public Foxglove() {
        super("Foxglove");
    }
}

class SunshineDaydream extends TemperateFlowers {
    public SunshineDaydream() {
        super("Sunshine Daydream");
    }
}

// Test the hierarchy
public class FlowerHierarchy {
    public static void main(String[] args) {
        Flowers[] flowers = {
            new Bougainvillea(),
            new Peonies(),
            new Roses(),
            new YellowRoses(),
            new Snapdragons(),
            new FestivaMaxima(),
            new ShrubRoses(),
            new NarcissusCarlton(),
            new Foxglove(),
            new SunshineDaydream()
        };

        for (Flowers flower : flowers) {
            flower.display();
        }
    }
}


