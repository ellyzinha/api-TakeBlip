package com.example.takeblip.model;

public class Repository {

    private String description;
    private String name;
    private String created_at;
    private String url;
    private String language;

    public Repository(String description, String name, String created_at, String url, String language) {
        this.description = description;
        this.name = name;
        this.created_at = created_at;
        this.url = url;
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
