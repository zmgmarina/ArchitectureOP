package seminar6;
import java.lang.Comparable;

/**
 * Это класс Cat
 * */
public class Cat {
    private String name;
    private String breed;



    /**Это конструктор...
     * @param breed это порода кошки
     * @param name это имя кошки
     * */

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!(obj instanceof Cat))
            return false;
        Cat other = (Cat) obj;
        return this.name.equals(other.name) && this.breed.equals(other.breed);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = hash * 9 + 7 + name.hashCode();
        hash = hash * 9 + 7 + breed.hashCode();
        return hash;
    }

    public String toString() {
        return String.format("%s %s", name, breed);
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

//    @Override
//    public int compareTo(Cat other) {  //  this.compareTo (other) - сравниваем этого кота с другим
//        if (this.name.compareTo(other.name) < 0) //если первое меньше второго
//            return -1;
//        else if (this.name.compareTo(other.name) > 0) // если первое больше второго
//            return 1;
//        else
//            return 0;

//    }


}

