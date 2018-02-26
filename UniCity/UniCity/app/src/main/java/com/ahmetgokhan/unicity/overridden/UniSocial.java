package com.ahmetgokhan.unicity.overridden;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UniSocial {

    @SerializedName("message")
    @Expose
    public String message;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("token")
    @Expose
    public String token;

    @SerializedName("universities")
    @Expose
    public String universities;

    
    @SerializedName("faculty")
    @Expose
    public String faculty;

    @SerializedName("advertName")
    @Expose
    private String advertName;

    @SerializedName("description")
    @Expose
    private String description;







    public UniSocial(String message, String name, String token, String universities, String faculty, String advertName, String description) {
        this.message = message;
        this.faculty = faculty;
        this.universities = universities;
        this.name = name;
        this.token = token;
        this.advertName = advertName;
        this.description = description;

    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversities() {
        return universities;
    }

    public void setUniversities(String universities) {
        this.universities = universities;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAdvertName() { return advertName; }

    public void setAdvertName(String advertName) { this.advertName = advertName; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }





}

