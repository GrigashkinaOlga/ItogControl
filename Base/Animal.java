
package Base;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private int id;
    private String name;
    private LocalDate birthDay;
    private String sex;
    private String comments;
    private List<String> commands;


    public Animal(int id, String name, LocalDate birthDay, String sex, String comments)
    {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.sex = sex;
        this.comments = comments;
        this.commands = new ArrayList<>();
    }

    public abstract String getType();
    
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Дата рождения: " + birthDay + 
               ", Пол: " + sex + ", Комментарий: " + comments + ", Команды: " + commands;
    }

    public void addCommand(String command) {
        commands.add(command);
    }

}

