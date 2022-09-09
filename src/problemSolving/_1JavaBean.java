package problemSolving;

public class _1JavaBean {
    //Create a JavaBean movie : Duration : Int , Name : String

    // Crate 2 objects of this bean and print the values in the main method

    public static void main(String[] args) {
      Movie movie1 = new Movie(2,"RRR");
      Movie movie2 = new Movie(3,"KGF");

      Movie movie3 = new Movie();
      movie3.setDuration(1);
      movie3.setName("Ironman");

      System.out.println(movie3);

      System.out.println(movie1.getDuration());
      System.out.println(movie1.getName());
    }
}

