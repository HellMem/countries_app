package coronadosolutions.countries_app.network;

import java.util.List;

import coronadosolutions.countries_app.models.Country;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CountriesWebService {
    @GET("all")
    Call<List<Country>> getCountries();
}
