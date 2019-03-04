package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */

    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this(Long.MIN_VALUE, "", new Address());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (o == this){
            result = true;
        }

        else if(!(o instanceof Person)){
            result = false;
        }
        else {
            Person person = (Person) o;
            result = this.equalsPerson(person);
        }
        return result;
    }

    public boolean equalsPerson(Person person){
        boolean result = true;
        // ID Check
        if (id == null){
            if (person.getId() != null){
                result = false;
            }
        }
        else if (person.getId() == null) {
            result = false;
        }
        else {
            result = id.equals(person.getId());
        }
        // Name Check
        if (name == null){
            if (person.getName() != null){
                result = false;
            }
        }
        else if (person.getName() == null) {
            result = false;
        }
        else {
            result = name.equals(person.getName());
        }
        // Address Check
        if (address == null){
            if (person.getAddress() != null){
                result = false;
            }
        }
        else if (person.getAddress() == null) {
            result = false;
        }
        else {
            result = address.equals(person.getAddress());
        }
        return result;
    }

    @Override
    public String toString(){
        String result = String.format("Person{id=%d, name='%s', address=%s}", id, name, address.toString());
        return result;
    }
}