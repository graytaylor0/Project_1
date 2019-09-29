package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DBMS database = new DBMS(); // OPEN
        Movie movie1 = new Movie(1, "Spiderman", 2002, "Action"); //INSERT INTO movies VALUES...
        Movie movie2 = new Movie(2, "Batman", 2008, "Action"); //INSERT INTO...
        Movie movie3 = new Movie(3, "Superman", 2012, "Action"); // INSERT INTO
        database.addMovie(movie1); // INSERT INTO..
        database.addMovie(movie2);// INSERT INTO
        database.addMovie(movie3); // INSERT INTO
        System.out.println(database.movies); // SHOW
        ArrayList<Movie> spidey = database.getMoviesByYear(">", 2008);
        System.out.println(spidey);
        /*Person person1 = new CastMember(0, "Taylor", "Lead");
        Person person2 = new CrewMember(1, "Nick", "Director");
        movie1.addPerson(person1);
        movie1.addPerson(person2);
        movie1.printCastAndCrew();
        movie1.removePerson(0);*/
    }
}
