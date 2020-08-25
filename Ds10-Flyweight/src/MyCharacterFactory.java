import java.util.HashMap;
import java.util.Map;
/**
 * @author dns007
 * @version 1.0
 * @date 2020/3/24
 */
public class MyCharacterFactory {
    private Map<Character, MyCharacter> pool;

    public MyCharacterFactory(){
       pool = new HashMap<Character, MyCharacter>();
    }

    public MyCharacter getMyCharacter(Character character){
        MyCharacter myChar = pool.get(character);
        if(myChar == null){
            myChar = new MyCharacter(character);
            pool.put(character, myChar);
        }
        return myChar;
    }
}
