package Base;

import java.time.LocalDate;


public abstract class AnimalPack extends Animal {


    public AnimalPack(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        super(id, name, birthDay, sex, comments);
    }


}