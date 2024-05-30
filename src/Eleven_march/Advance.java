package Eleven_march;

import java.util.Objects;

public class Advance {
    public static void main(String[] args) {
        //Q1
        System.out.println("====Q1====");
        Holiday day1 = new Holiday("uttrayan",14,"january");
        Holiday day2 = new Holiday("republic day",26,"january");
        Holiday day3 = new Holiday("uttrayan",14,"january");
        Holiday day4 = new Holiday("republic day",26,"january");
        Holiday day5 = new Holiday("uttrayan",14,"january");
        Holiday day6 = new Holiday("republic day",26,"january");

       if (inSameMonth(day1.month,day2.month)){
           System.out.println(true);
       } else {
           System.out.println(false);
       }

       Holiday[] days = new Holiday[6];
       days[0] = day1;
       days[1] = day2;
       days[2] = day3;
       days[3] = day4;
       days[4] = day5;
       days[5] = day6;

       // print average of the days
       System.out.println(aveDate(days));

       //Q2
        System.out.println("====Q2====");
        Movie movie1 = new Movie("abc","123","2 star");
        Movie movie2 = new Movie("Kasoombo","456");
        Movie movie3 = new Movie("xyz","789","4 star");
        Movie movie4 = new Movie("shaitaan","789","5 star");


        Movie[] movies = new Movie[4];
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;
        movies[3] = movie4;

        Movie[] fiveStarMovies = get5StarMovies(movies);
        for (int i = 0; i < fiveStarMovies.length; i++){
            System.out.println(fiveStarMovies[i].title + " " + fiveStarMovies[i].rating);
        }


    }
    public static boolean inSameMonth(String month1, String month2){
        if (month1.equals(month2)){
            return true;
        }
        return false;
    }

    public static double aveDate(Holiday[] days){
        int sum = 0;

        for (int i = 0; i < days.length; i++){
            sum += days[i].day;
        }

        return sum / days.length;
    }
    public static Movie[] get5StarMovies(Movie[] movies){
        int count = 0;
        for (int i = 0; i < movies.length; i++){
            if (movies[i].rating.equals("5 star")){
                count++;
            }
        }

        Movie[] fiveStarMovies = new Movie[count];
        int index = 0;
        for (int i = 0; i < movies.length; i++){
            if (movies[i].rating.equals("5 star")){
               fiveStarMovies[index++] = movies[i];
            }
        }

        return fiveStarMovies;
    }
}

class Holiday{
    String name;
    int day;
    String month;

    Holiday(String name, int day, String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }
}

class Movie{
     String title;
     String studio;
     String rating;
    Movie( String title, String studio,String rating){
        this.rating = rating;
        this.title = title;
        this.studio = studio;
    }
    Movie( String title, String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "5 star";
    }

}
