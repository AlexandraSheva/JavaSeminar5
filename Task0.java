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
/*public class Task0 {

  public static void main(String[] args) {
    task0();
  }

  static void task0() {

    Passport passport = new Passport() ;
    passport.add ("123456","Иванов");
    passport.add ("321456","Васильев");
    passport.add ("1234535","Петров");
    passport.add ("23445345","Лимонов");

    System.out.println(get.getByLastName("Иванов"));
    System.out.println(get.getByPassNum("123456"));
    System.out.println(passport.getAll());



  }
} */

import java.util.HashMap;
import java.util.Map;

public class Passport {
    private Map<String, String> map = new HashMap<>();

    void add(String passNum, String lastName){
        map.put(passNum,lastName);
    }

    String getByPassNum(String passNum){
        return passNum + " : " + map.get(passNum);
    }

    String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
             map.entrySet()) {
            if(entry.getValue().equals(lastName)){
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
            
        }
        return stringBuilder.toString();
    }

    String getAll(){
        return map.toString();
    }

}