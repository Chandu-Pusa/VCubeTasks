package com.javamethods;

import java.util.Scanner;

public class Movie {

    void movieName(String name) {
        System.out.println("Movie Name: " + name);
    }

    void heroName(String hero) {
        System.out.println("Hero Name: " + hero);
    }

    void heroineName(String heroine) {
        System.out.println("Heroine Name: " + heroine);
    }

    void movieDirector(String director) {
        System.out.println("Director: " + director);
    }

    void movieYear(int year) {
        System.out.println("Movie Year: " + year);
    }

    void movieBudget(double budget) {
        System.out.println("Movie Budget: " + budget);
    }

    void movieRating(double rating) {
        System.out.println("Movie Rating: " + rating);
    }

    void movieLanguage(String language) {
        System.out.println("Movie Language: " + language);
    }

    void movieDuration(int duration) {
        System.out.println("Movie Duration: " + duration + " minutes");
    }

    void movieGenre(String genre) {
        System.out.println("Movie Genre: " + genre);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Movie m = new Movie();

        System.out.print("Enter Movie Name: ");
        m.movieName(sc.nextLine());

        System.out.print("Enter Hero Name: ");
        m.heroName(sc.nextLine());

        System.out.print("Enter Heroine Name: ");
        m.heroineName(sc.nextLine());

        System.out.print("Enter Director Name: ");
        m.movieDirector(sc.nextLine());

        System.out.print("Enter Movie Year: ");
        m.movieYear(sc.nextInt());

        System.out.print("Enter Movie Budget: ");
        m.movieBudget(sc.nextDouble());

        System.out.print("Enter Movie Rating: ");
        m.movieRating(sc.nextDouble());

        sc.nextLine();

        System.out.print("Enter Movie Language: ");
        m.movieLanguage(sc.nextLine());

        System.out.print("Enter Movie Duration: ");
        m.movieDuration(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Movie Genre: ");
        m.movieGenre(sc.nextLine());

        sc.close();
    }
}