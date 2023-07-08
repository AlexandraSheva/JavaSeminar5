/**
 * Task0. Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

123456 Иванов

321456 Васильев

234561 Петрова

234432 Иванов

654321 Петрова

345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.

</aside>
 */
public class Task0 {

  public static void main(String[] args) {
    task0();
  }

  static void task0() {

    Passport passport = new Passport() ;
    passport.add ("123456","Иванов");
    passport.add ("321456","Васильев");
    passport.add ("1234535","Петров");
    passport.add ("23445345","Лимонов");

    System.out.println(passport.getByLastName("Иванов"));
    System.out.println(passport.getByPassNum("123456"));
    System.out.println(passport.getAll());



  }
} 
