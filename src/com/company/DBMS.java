package com.company;

import java.util.ArrayList;

public class DBMS {
    public ArrayList<Movie> movies = new ArrayList<Movie>();
    public ArrayList<Person> people = new ArrayList<Person>();

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void addPerson(Person person){
        people.add(person);
    }

    public Movie getMovieById(int id){
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                return movies.get(i);
            }
        }
        return new Movie();
    }

    public ArrayList<Movie> getMoviesByName(String name){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName() == name) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public ArrayList<Movie> getMoviesByName(int year){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getYear() == year) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public ArrayList<Movie> getMoviesByGenre(String genre){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getGenre() == genre) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }
}
