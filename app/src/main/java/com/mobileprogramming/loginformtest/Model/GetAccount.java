package com.mobileprogramming.loginformtest.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAccount {
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    List<Account> listDataNotes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Account> getListDataNotes() {
        return listDataNotes;
    }

    public void setListDataNotes(List<Account> listDataNotes) {
        this.listDataNotes = listDataNotes;
    }

}
