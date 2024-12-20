package Animal;

import Base.AnimalPack;

import java.time.LocalDate;

public class Camel extends AnimalPack {

    public Camel(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        super(id, name, birthDay, sex, comments);
    }
    
    @Override
    public String getType() {
        return "Camel";
    }

}