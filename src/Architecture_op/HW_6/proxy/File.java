package Architecture_op.HW_6.proxy;

import java.util.HashMap;

public class File implements Notebook{
//Блокнот. Записываем информацию в хеш-таблицу.
    private HashMap<String, String> hashMap = new HashMap<>();

    /**
     * @apiNote Метод чтения информации из блокнота
     * @param key
     * @return value
     */
    @Override
    public String read(String key) {
    String value = hashMap.get(key);
        System.out.println("Read  from file: " + key + "-" + value);
        return value;
    }

    /**
     * @apiNote Метод записи информации в блокнот
     * @param key
     * @param value
     * @return hashMap.put(key, value)
     */
    @Override
    public String write(String key, String value) {
        System.out.println("Write file: " + key + "-" + value);
        return hashMap.put(key, value);
    }


}
