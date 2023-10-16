package Architecture_op.HW_6.proxy;


import java.util.HashMap;

//Кеширующий заместитель сначала ищет записи в кеше, потом передает управление реальному объекту класса File
public class CacheProxy implements  Notebook{

    private HashMap<String, String> cache;
    private File file;

    public CacheProxy() {
        this.cache = new HashMap<String, String>();
        this.file = new File();
    }

    /**
     * @apiNote Метод чтения информации из кеша, если она в нем содержится
     * @param key
     * @return value
     */
    @Override
    public String read(String key) {
        String value = cache.get(key);
        if (value != null){
            return value;
        }
        value = file.read(key);
        cache.put(key, value);
        System.out.println("Read from cache: " + key + "-" + value);
        return value;
    }

    /**
     * @apiNote Метод вызова метода записи у объекта класса File
     * @param key
     * @param value
     * @return
     */
    @Override
    public String write(String key, String value) {
        return file.write(key, value);
    }
}
