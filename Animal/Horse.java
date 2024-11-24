package Animal;

import Base.AnimalPack;

import java.time.LocalDate;


public class Horse extends AnimalPack {

    public Horse(int id, String nickName, LocalDate birthDay, String sex, String comments)
    {
        super(id, nickName, birthDay, sex, comments);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}