package sprint2.day3;

public class _9ParamConstructors {
    // create a class Movie(noOfSongs, duration)
    //
    public static void main(String[] args) {
        Movie obj = new Movie(5);
        System.out.println(obj.noOfSong);
    }
}

class Movie{
    int noOfSong;

    Movie(){
        System.out.println("");
    }

    Movie(int song){
    noOfSong = song;
    }
}