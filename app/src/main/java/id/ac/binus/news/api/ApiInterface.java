package id.ac.binus.news.api;

import id.ac.binus.news.models.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("everything")
    Call<News> getNews(
            @Query("q") String q,
            @Query("language") String language ,
            @Query("sortBy") String SortBy,
            @Query("apiKey") String apiKey
    );
}
