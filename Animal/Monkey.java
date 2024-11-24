package Animal;

import Base.AnimalPack;

import java.time.LocalDate;


public class Monkey extends AnimalPack {

    public Monkey(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        super(id, name, birthDay, sex, comments);
    }


    @Override
    public String getType() {
        return "Monkey";
    }
}