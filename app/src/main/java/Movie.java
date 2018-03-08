import com.example.zealya.myapplication.R;

/**
 * Created by Zealya on 3/7/2018.
 */

public class Movie {

    public static final String imageSizeCode = "w185";
    public static final String basePosterURL = "http://image.tmdb.org/t/p";

    String movieName; //title in API
    String releaseDate; // release_date string YYYY-MM-DD
    int runtimeInMinutes; //runtime in GetDetails API
    float popularity; // popularity decimal xxx.xxxxxx
    float rating; //vote_average x.x
    String synopsis; //overview
    String posterRelativelink; //poster path
}
