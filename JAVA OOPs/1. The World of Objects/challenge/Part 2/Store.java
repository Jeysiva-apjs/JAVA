public class Store {

    private Movie[] movies;

    public Store() {
        for(int i=0; i<10; i++){
            movies[i] = null;
        }  
    }

    public Movie getMovie(int index) {
        return this.movies[index];
    }

    public void setMovie(int index, Movie movie) {
        this.movies[index] = movie; 
    }


    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
