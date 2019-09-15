# Countries

Get all countries API Call Example:

```
        WebServiceBuilder webServiceBuilder = WebServiceBuilder.getInstance();
        CountriesWebService countriesWebService = webServiceBuilder.getCountriesWebService();
        countriesWebService.getCountries().enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {

            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {

            }
        });

```

