package Base;

import java.time.LocalDate;


public abstract class AnimalPets extends Animal {


    public AnimalPets(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        super(id, name, birthDay, sex, comments);
    }
}


