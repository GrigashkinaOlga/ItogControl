package Base;

import java.util.Date;
import java.util.List;

public abstract class AnimalPack extends Animal {


    public AnimalPack(int id, String name, Date birthDay, AnimalSex sex, String comments, List<String> commands)
    {
        super(id, name, birthDay, sex, comments, commands);
    }


}