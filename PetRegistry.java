import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Animal.Camel;
import Animal.Cat;
import Animal.Dog;
import Animal.Hamster;
import Animal.Horse;
import Animal.Monkey;
import Base.Animal;

public class PetRegistry {
    private List<Animal> animals = new ArrayList<>();
    private int idCounter = 1;

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Реестр домашних животных пуст.");
        } else {
            for (Animal animal : animals) {
                System.out.println(animal.getType() + ": " + animal);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetRegistry registry = new PetRegistry();

        while (true) {
            System.out.println("\n1. Завести новое животное");
            System.out.println("2. Показать реестр животных");
            System.out.println("3. Выход");
            System.out.print("Выберите действие (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера ввода

            if (choice == 1) {
                System.out.print("Введите имя животного: ");
                String name = scanner.nextLine();
                System.out.print("Введите дату рождения (гггг-мм-дд): ");
                LocalDate birthDate = LocalDate.parse(scanner.nextLine());
                System.out.print("Введите пол (м/ж): ");
                String sex = scanner.nextLine();
                System.out.print("Введите комментарий: ");
                String comment = scanner.nextLine();

                System.out.println("Выберите тип животного (1. Собака, 2. Кошка, 3. Лошадь, 4. Обезьяна, 5. Верблюд, 6. Хомяк): ");
                int typeChoice = scanner.nextInt();
                Animal newAnimal = null;

                switch (typeChoice) {
                    case 1:
                        newAnimal = new Dog(registry.idCounter++, name, birthDate, sex, comment);
                        break;
                    case 2:
                        newAnimal = new Cat(registry.idCounter++, name, birthDate, sex, comment);
                        break;
                    case 3:
                        newAnimal = new Horse(registry.idCounter++, name, birthDate, sex, comment);
                        break;
                    case 4:
                        newAnimal = new Monkey(registry.idCounter++, name, birthDate, sex, comment);
                        break;
                    case 5:
                        newAnimal = new Camel(registry.idCounter++, name, birthDate, sex, comment);
                        break;
                    case 6:
                        newAnimal = new Hamster(registry.idCounter++, name, birthDate, sex, comment);
                        break;
                    default:
                        System.out.println("Неверный выбор!");
                        continue;
                }

                try (Counter counter = new Counter()) {
                    // Увеличиваем счетчик только если все поля заполнены
                    counter.add();
                    registry.addAnimal(newAnimal);
                    System.out.println("Добавлено животное: " + newAnimal);
                    System.out.println("Количество животных: " + counter.getCount());
                } catch (IllegalStateException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else if (choice == 2) {
                registry.displayAnimals();
            } else if (choice == 3) {
                System.out.println("Выход из программы.");
                scanner.close();
                return;
            } else {
                System.out.println("Неверный выбор! Пожалуйста, выберите действие от 1 до 3.");
            }
        }
    }
}