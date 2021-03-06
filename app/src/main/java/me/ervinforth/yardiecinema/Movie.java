package me.ervinforth.yardiecinema;

public class Movie {

    private String name;
    private String castMembers;
    private int year;
    private String runtime;
    private String plot;
    private String rating;
    private String moviePoster;
    private String director;
    private String productionCompany;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(String castMembers) {
        this.castMembers = castMembers;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", castMembers='" + castMembers + '\'' +
                ", year=" + year +
                ", runtime='" + runtime + '\'' +
                ", plot='" + plot + '\'' +
                ", rating='" + rating + '\'' +
                ", moviePoster='" + moviePoster + '\'' +
                ", director='" + director + '\'' +
                ", productionCompany='" + productionCompany + '\'' +
                '}';
    }
}
