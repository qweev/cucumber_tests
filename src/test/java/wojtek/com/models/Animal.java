package wojtek.com.models;

public class Animal {

    private String name;
    private String surname;
    private String comment;
    private String anything;

    public Animal(String name, String surname, String comment, String anything) {
        this.name = name;
        this.surname = surname;
        this.comment = comment;
        this.anything = anything;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", comment='" + comment + '\'' +
                ", anything='" + anything + '\'' +
                '}';
    }

}
