import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

/**
 * Pasport

public class Passport {

  private Map <String, String> map = new HashMap <> ();
   
  void add (String passNum, String lastName){
    map.put(passNum, lastName) ;
     }

  String getByPassNum (String passNum) {
      return passNum + ":" + map.get(passNum);
     }

  String getByLastName (String lastName) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Map.Entry entry:
    map.entrySet()) {
      if(entry.getValue().equals(lastName)) {
        stringBuilder.append(entry.getKey());
        stringBuilder.append(":");
        stringBuilder.append(entry.getValue());
        stringBuilder.append("\n");

      }
    }

    return stringBuilder.toString();
  }

  String getAll() {
    return map.toString();
  }
}m*/


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
    for (final Map.Entry entry:
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