package com.company;

import java.util.ArrayList;

public class DBMS {
    public static ArrayList<Movie> movies = new ArrayList<Movie>();
    public static ArrayList<Person> people = new ArrayList<Person>();
    public static ArrayList<String> token = new ArrayList<String>();

    public boolean compareTo(String operator, int num1, int num2){
        if (operator.equals("==")){
            return num1 == num2;
        }else if (operator.equals("!=")) {
            return num1 != num2;
        }else if (operator.equals("<")) {
            return num1 < num2;
        }else if (operator.equals(">")) {
            return num1 > num2;
        }else if (operator.equals(">=")) {
            return num1 >= num2;
        }else if (operator.equals("<=")) {
            return num1 <= num2;
        }
        return false;
    }

    public static ArrayList<String> terminalNodes = new ArrayList<String>(); // Added list of terminal nodes from old Dbms

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

    public ArrayList<Movie> getMoviesByYear(String operator, int year){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (compareTo(operator, movies.get(i).getYear(), year)) {
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
