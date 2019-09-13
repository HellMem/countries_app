package coronadosolutions.countries_app.models;

import com.google.gson.annotations.SerializedName;

public class Country {

    @SerializedName("name")
    private String name;

    @SerializedName("capital")
    private String capital;


    @SerializedName("flag")
    private String flag;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }


    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
