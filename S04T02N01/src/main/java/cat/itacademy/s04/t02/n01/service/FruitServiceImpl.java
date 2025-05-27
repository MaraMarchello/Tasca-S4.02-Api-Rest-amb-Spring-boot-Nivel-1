package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {

    private final FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit addFruit(Fruit fruit) {
        if (fruitRepository.existsByNameIgnoreCase(fruit.getName())) {
            throw new IllegalArgumentException("Fruit with name " + fruit.getName() + " already exists");
        }
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Long id, Fruit fruit) {
        Fruit existingFruit = getFruitById(id);
        
        existingFruit.setName(fruit.getName());
        existingFruit.setQuantityKilos(fruit.getQuantityKilos());
        
        return fruitRepository.save(existingFruit);
    }

    @Override
    public void deleteFruit(Long id) {
        if (!fruitRepository.existsById(id)) {
            throw new FruitNotFoundException(id);
        }
        fruitRepository.deleteById(id);
    }

    @Override
    public Fruit getFruitById(Long id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException(id));
    }

    @Override
    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
} 