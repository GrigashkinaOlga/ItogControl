package Animal;

import Base.AnimalPack;
import Base.AnimalSex;


import java.util.Date;
import java.util.List;

public class Donkey extends AnimalPack {

    public Donkey(int id, String name, Date birthDay, AnimalSex sex, String comments, List<String> commands)
    {
        super(id, name, birthDay, sex, comments, commands);
    }

    @Override
    public String getType() {
        return "Donkey";
    }
}