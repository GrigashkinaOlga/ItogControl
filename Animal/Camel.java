package Animal;

import Base.AnimalPack;
import Base.AnimalSex;

import java.util.Date;
import java.util.List;

public class Camel extends AnimalPack {

    public Camel(int id, String name, Date birthDay, AnimalSex sex, String comments, List<String> commands)
    {
        super(id, name, birthDay, sex, comments, commands);
    }
    
    @Override
    public String getType() {
        return "Camel";
    }

}