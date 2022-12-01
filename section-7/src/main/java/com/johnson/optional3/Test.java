package com.johnson.optional3;

import java.util.Optional;
import java.util.function.Function;

class Insurance {

    private String name;

    public String getName() {
        return name;
    }

}

class Car {

    private Optional<Insurance> optionalInsurance;

    public Insurance getInsurance() {
        return optionalInsurance.orElse(null);
    }

    public Optional<Insurance> getOptionalInsurance() {
        return optionalInsurance;
    }

}

class Person {

    private Optional<Car> optionalCar;

    public Optional<Car> getOptionalCar() {
        return optionalCar;
    }
}


public class Test {

    public Optional<String> getCarInsuranceName(Person person) {
        Optional<Car> optionalCar = person.getOptionalCar();
        String insuranceName;
        /**
         * .getInsurance() devuelve un objeto de tipo Insurance puro
         * por lo que la función transforma un Optional de tipo Car a un Optional de tipo Insurance
         */
        Function<Car, Insurance> carToInsurance = car -> car.getInsurance();
        Optional<Insurance> optionalInsurance = optionalCar.map(carToInsurance);
        // ahora quiero el atributo Name de Insurance que es de tipo String
        Function<Insurance, String> insuranceToString = insurance -> insurance.getName();
        Optional<String> optionalString = optionalInsurance.map(insuranceToString);
        insuranceName = optionalString.orElseGet(() -> "no insurance");
        /**
         * .getOptionalInsurance() devuelve un objeto de Optional que envuelve un tipo Insurance
         * por lo que la función transforma un Optional de tipo Car a un Optional de tipo Optional que envuelve un tipo Insurance
         */
        Function<Car, Optional<Insurance>> carToOptionalInsurance = car -> car.getOptionalInsurance();
        Optional<Optional<Insurance>> optionalOptionalInsurance = optionalCar.map(carToOptionalInsurance);

        return Optional.empty();
    }

    public Optional<String> getCarInsuranceNameWithMap(Person person) {
        return person.getOptionalCar()
                .map(car -> car.getInsurance())
                .map(insurance -> insurance.getName());
    }

    public Optional<String> getCarInsuranceNameWithFlatMap(Person person) {
        return person.getOptionalCar()
                .flatMap(car -> car.getOptionalInsurance())
                .map(insurance -> insurance.getName());
    }

}