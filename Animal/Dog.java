package Animal;

import Base.AnimalPets;

import java.time.LocalDate;


public class Dog extends AnimalPets {

    public Dog(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        super(id, name, birthDay, sex, comments);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}