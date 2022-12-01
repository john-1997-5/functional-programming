package com.johnson.optional2;


import java.util.Optional;
import java.util.function.Function;

class Car {
    private String marca;

    public Car() {
        this.marca = "Wolkswagen";
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

class Person {
    private String nombre;
    private Car car;

    public Person() {
        this.nombre = "Johnson";
        this.car = new Car();
    }

    public String getNombre() {
        return nombre;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", car=" + car +
                '}';
    }
}

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        Function<Person, Car> f = p -> p.getCar();

        Optional<Person> personOptional = Optional.of(person);
        personOptional.ifPresent(System.out::println);
        Optional<Car> carOptional = personOptional.map(f);
        carOptional.ifPresent(System.out::println);

        Car car = Optional.of(new Person())
                .map(p -> p.getCar())
                .orElse(null);
        System.out.println(car);

    }
}
