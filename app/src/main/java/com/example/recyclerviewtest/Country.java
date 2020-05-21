package com.example.recyclerviewtest;

import android.os.Parcel;
import android.os.Parcelable;

public class Country implements Parcelable {
    private String countryName;
    private String flagLink;
    private String capital;
    private String website;


    Country(String name, String link, String capital,String website) {
        this.countryName = name;
        this.flagLink = link;
        this.capital = capital;
        this.website = website;
    }

    private Country(Parcel in) {
        countryName = in.readString();
        flagLink = in.readString();
        capital = in.readString();
        website = in.readString();
    }

    public static final Creator<Country> CREATOR = new Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    String getFlagLink() {
        return flagLink;
    }

    public void setFlagLink(String flagLink) {
        this.flagLink = flagLink;
    }


    String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(countryName);
        dest.writeString(flagLink);
        dest.writeString(capital);
        dest.writeString(website);
    }
}
