package pl.japonics;

import java.text.Collator;
import java.util.*;

/**
 * Created by OskarPraca on 2017-03-18.
 */
public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Oskar", "Polak", 30));
        personList.add(new Person("Adam", "Trybancki", 70));
        personList.add(new Person("Karol", "Nowak", 54));
        personList.add(new Person("Damian", "Góra", 93));
        personList.add(new Person("Wiktor", "Nowicki", 23));

        List<String> stringList = new ArrayList<>();
        stringList.add("Aasda");
        stringList.add("Tomek");
        stringList.add("Ada");
        stringList.add("Filemon");
        Locale pl = new Locale("pl-PL");
        Collator plExtender  = Collator.getInstance();

Collections.sort(personList,new CompareByLastname());

        for(Person person : personList) {
            System.out.println(person.toString());
        }


    }
    private static class CompareByName implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    private static class CompareByLastname implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
    }

    /**
     * Created by Justyna on 18.03.2017.
     */
    public static class Person implements Comparable<Person>{

        private String name;
        private String lastname;
        private int age;

        public Person(String name, String lastname, int age) {
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person o) {
            if(getAge() > o.getAge()) {
                return -1;
            }else if(getAge() == o.getAge()) {
                return 0;
            }else{
                return 1;
            }
        }

        @Override
        public String toString() {
            return "pl.japonics.Main.Person{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}