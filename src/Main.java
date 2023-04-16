public class Main {
    public static void main(String[] args) {
        Студент h1 = new Студент(21, "Дмитрий", "Накиев");
        Студент h2 = new Студент(h1);
        h2.setName("Рома");
        h2.age = 22;
        h2.surname = "Пупкин";
        Студент h3 = new Студент(h2);
        h3.setName("Кефтем");
        h3.age = 20;
        h3.surname = "Бархатов";
        Учитель teacher = new Учитель(h1, h2, h3);
        teacher.students[0].Informationst();
        teacher.students[1].Informationst();
        teacher.students[2].Informationst();
        Учитель f1 = new Учитель(38, "Ачун", "Анечунов");
        Учитель f2 = new Учитель(f1);
        f2.age = 43;
        f2.name = "Аркадий";
        f2.surname = "Акцизионов";
        Учитель f3 = new Учитель(f2);
        f3.age = 40;
        f3.name = "Иван";
        f3.surname = "Огурецын";
        Учитель Учитель = new Учитель(f1, f2, f3);
        System.out.println("Информация об учителях: " + f1.name + " " + f1.age + " " + "возраст" + " " + f1.surname);
        System.out.println("Информация об учителях: " + f2.name + " " + f2.age + " " + "возраст" + " " + f2.surname);
        System.out.println("Информация об учителях: " + f3.name + " " + f3.age + " " + "возраст" + " " + f3.surname);
    }
}