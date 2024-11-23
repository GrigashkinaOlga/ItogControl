package Animal;

import Base.AnimalPets;
import Base.AnimalSex;

import java.util.Date;
import java.util.List;

public class Dog extends AnimalPets {

    public Dog(int id, String name, Date birthDay, AnimalSex sex, String comments, List<String> commands)
    {
        super(id, name, birthDay, sex, comments, commands);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}