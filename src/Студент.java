public class Студент {
    int age;
    private String name;
    String surname;

    public static void Informationte(Учитель f1 ) {
    }

    void setName(String name) {
        name = this.name;
    }
    String getName() {
        return name;
    }
    Студент(int newAge, String newName, String newSurname) {
        age = newAge;
        name = newName;
        surname = newSurname;
    }
    Студент(Студент h) {
        age = h.age;
        name = h.name;
        surname = h.surname;
    }

    void Informationst() {
        System.out.println("Информация о студенте: " + name +" "+ age+" возраст " + surname);

    }
}
