package com.mobileprogramming.loginformtest.Model;

import com.google.gson.annotations.SerializedName;

public class Account {
    @SerializedName("id")
    private String id;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("tgl_lahir")
    private String tgl_lahir;
    @SerializedName("jenkel")
    private String jenkel;
    @SerializedName("no_hp")
    private String no_hp;
    @SerializedName("alamat")
    private String alamat;

    public Account(){}

    public Account(String id, String username, String password, String tgl_lahir, String jenkel, String no_hp, String alamat) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tgl_lahir = tgl_lahir;
        this.jenkel = jenkel;
        this.no_hp = no_hp;
        this.alamat = alamat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
