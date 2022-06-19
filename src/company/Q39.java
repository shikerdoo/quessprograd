package company;
//The class Movie is started below. An instance of class Movie represents a film.
// This class has the following three class variables: title, which is a String representing the
// title of the movie studio, which is an String representing the studio that made the movie rating,
// which is a String representing the rating of the movie (i.e. PG-13, R, etc) public class Movie
// { private String title; private String studio; private String rating; // your code goes here }

//Req 1 :Write a constructor for the class Movie, which takes a String representing the title of the movie,
// a String representing the studio, and a String representing the rating as its arguments, and
// sets the respective class variables to these values

//Req 2: Write a second constructor for the class Movie, which takes a String representing the
// title of the movie and a String representing the studio as its arguments, and sets the
// respective class variables to these values, while the class variable rating is set to “PG”.

//Req3:Write a method getPg, which takes an array of base type Movie as its argument, and returns
// a new array of only those movies in the input array with a rating of “PG”. You may assume
// that the input array is full of Movie instances. The returned array need not be full.

//Req 4:Write a piece of code that creates an instance of the class Movie with the title “Casino Royale”,
// the studio “Eon Productions”, and the rating “PG-13”.

import java.util.ArrayList;

class Movie{
    private String title;
    private String rating;
    private String studio;
    public Movie(String title,String studio,String rating)
    {
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    public Movie(String title,String studio)
    {
        this.title=title;
        this.studio=studio;
        this.rating="PG";
    }

    public Movie[] getPg(Movie[] input)
    {
        Movie[] output=new Movie[input.length];
        int j=0;
        for(int i=0;i<input.length;i++)
            if(input[i].rating=="PG")
                output[j++]=input[i];
        return output;
    }
}
public class jj4 {
    public static void main(String[] args) {
        Movie m=new Movie("Casino Royale","Eon Productions","PG-13");
    }
}
