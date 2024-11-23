package Animal;

import Base.AnimalPack;
import Base.AnimalSex;

import java.util.Date;
import java.util.List;

public class Horse extends AnimalPack {

    public Horse(int id, String nickName, Date birthDay, AnimalSex sex, String comments, List<String> commands)
    {
        super(id, nickName, birthDay, sex, comments, commands);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}