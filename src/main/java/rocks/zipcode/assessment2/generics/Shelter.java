package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Ageable> implements Iterable{
    ArrayList<Ageable> shelterList;

    public Shelter() {
        shelterList = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelterList.size();
    }

    public void add(Ageable object) {
        shelterList.add(object);
    }

    public Boolean contains(Ageable object) {
        return shelterList.contains(object);
    }

    public void remove(Ageable object) {
        shelterList.remove(object);
    }

    public Object get(Integer index) {
        return shelterList.get(index);
    }

    public Integer getIndexOf(Ageable ageable) {
        for (int i = 0; i < shelterList.size(); i++) {
            if (shelterList.get(i).equals(ageable)){
                return i;
            }
        }
        return 0;
    }

    @Override
    public Iterator<Ageable> iterator() {
        return shelterList.iterator();
    }
}