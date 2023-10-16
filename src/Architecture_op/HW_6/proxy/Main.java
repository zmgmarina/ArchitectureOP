package Architecture_op.HW_6.proxy;

public class Main {
    public static void main(String[] args) {
        //Вместо объекта класса File создаем объект класса CacheProxy()
        Notebook notebook = new CacheProxy();
        notebook.write("1", "value_1");
        notebook.write("2", "value_2");
        notebook.write("3", "value_3");
        System.out.println("-------------------");
        notebook.read("1"); //чтение из файла
        notebook.read("1"); //чтение из кеша
    }
}
//Благодаря использованию кеширующего заместителя программа выполняется быстрее,
// т.к. повторяющуюся информацию мы получаем из кеша