public class Учитель {
    int age;
    String name;
    String surname;

    Учитель(int newAge, String newName, String newSurname) {
        age = newAge;
        name = newName;
        surname = newSurname;
    }

    Студент[] students = new Студент[3];

    Учитель(Студент h1, Студент h2, Студент h3) {
        students[0] = h1;
        students[1] = h2;
        students[2] = h3;
    }

    Учитель(Учитель f) {
        age = f.age;
        name = f.name;
        surname = f.surname;
    }



    Учитель[] erere = new Учитель[3];
    Учитель(Учитель f1, Учитель f2, Учитель f3) {
        erere[0] = f1;
        erere[1] = f2;
        erere[2] = f3;
    }
}
