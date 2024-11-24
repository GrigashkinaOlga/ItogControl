package Animal;

import Base.AnimalPets;

import java.time.LocalDate;


public class Cat extends AnimalPets {

    public Cat(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        super(id, name, birthDay, sex, comments);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}