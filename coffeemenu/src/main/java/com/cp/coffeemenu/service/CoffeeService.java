package com.cp.coffeemenu.service;

import com.cp.coffeemenu.model.Coffee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoffeeService {
    private List<Coffee> coffeeList = new ArrayList<>();
    private Long nextId = 1L;

    public CoffeeService() {
        coffeeList.add(new Coffee(nextId++, "Espresso", 45.0));
        coffeeList.add(new Coffee(nextId++, "Latte", 55.0));
    }

    public List<Coffee> getAllCoffees() {
        return coffeeList;
    }

    public Optional<Coffee> getCoffeeById(Long id) {
        return coffeeList.stream()
                .filter(coffee -> coffee.getId().equals(id))
                .findFirst();
    }

    public Coffee addCoffee(Coffee coffee) {
        coffee.setId(nextId++);
        coffeeList.add(coffee);
        return coffee;
    }

    public Optional<Coffee> updateCoffee(Long id, Coffee updatedCoffee) {
        return getCoffeeById(id).map(coffee -> {
            coffee.setName(updatedCoffee.getName());
            coffee.setPrice(updatedCoffee.getPrice());
            return coffee;
        });
    }

    public boolean deleteCoffee(Long id) {
        return coffeeList.removeIf(coffee -> coffee.getId().equals(id));
    }
}
