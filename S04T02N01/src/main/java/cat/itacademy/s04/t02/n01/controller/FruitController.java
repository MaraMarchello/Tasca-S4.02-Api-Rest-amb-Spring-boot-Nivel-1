package cat.itacademy.s04.t02.n01.controller;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.service.FruitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    private final FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@Valid @RequestBody Fruit fruit) {
        Fruit newFruit = fruitService.addFruit(fruit);
        return new ResponseEntity<>(newFruit, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> updateFruit(
            @PathVariable Long id,
            @Valid @RequestBody Fruit fruit) {
        Fruit updatedFruit = fruitService.updateFruit(id, fruit);
        return ResponseEntity.ok(updatedFruit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruit(@PathVariable Long id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruit(@PathVariable Long id) {
        Fruit fruit = fruitService.getFruitById(id);
        return ResponseEntity.ok(fruit);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits() {
        List<Fruit> fruits = fruitService.getAllFruits();
        return ResponseEntity.ok(fruits);
    }
} 