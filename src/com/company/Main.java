package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Movie movie1 = new Movie(1, "Spiderman", 2002, "Action");
        Person person1 = new CastMember(0, "Taylor", "Lead");
        Person person2 = new CrewMember(1, "Nick", "Director");
        movie1.addPerson(person1);
        movie1.addPerson(person2);
        movie1.printCastAndCrew();
        movie1.removePerson(0);
    }
}
