/**
 * This Class shows how to create a Person by name and Nationality
 */
package ch3;
public class Person {
    private String name;
    private Nationality homeland;

    /**
     * This constructor instantiates a person by name Nationality
     * @param n person name
     * @param h Enum Nationality
     */
    public Person(String n, Nationality h){
        name = n;
        homeland = h;
    }

    /**
     * Getter Method for private field name
     * @return a string, person's name
     */
    public String getName(){
        return this.name;
    }

}
