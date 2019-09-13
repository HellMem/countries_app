package coronadosolutions.countries_app.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WebServiceBuilder {

    private Retrofit client;
    private final String BASE_URL = "https://restcountries.eu/rest/v2/";
    private CountriesWebService countriesWebService;
    private static WebServiceBuilder INSTANCE;

    private WebServiceBuilder() {
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();


        client = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

    }

    public static WebServiceBuilder getInstance() {
        if (INSTANCE == null)
            INSTANCE = new WebServiceBuilder();

        return INSTANCE;
    }

    public CountriesWebService getCountriesWebService() {
        if(countriesWebService == null)
            countriesWebService = client.create(CountriesWebService.class);
        return countriesWebService;
    }
}
