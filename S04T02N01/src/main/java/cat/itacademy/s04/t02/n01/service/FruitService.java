package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.model.Fruit;
import java.util.List;

public interface FruitService {
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Long id, Fruit fruit);
    void deleteFruit(Long id);
    Fruit getFruitById(Long id);
    List<Fruit> getAllFruits();
} 