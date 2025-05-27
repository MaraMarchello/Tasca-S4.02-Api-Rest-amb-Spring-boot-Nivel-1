package cat.itacademy.s04.t02.n01.exception;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(String message) {
        super(message);
    }

    public FruitNotFoundException(Long id) {
        super("Fruit not found with id: " + id);
    }
} 