package com.project.kzstartup.model;

/**
 * Created by onuchin on 31.12.2016.
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("content")
    @Expose
    private ArrayList<Content> contacts =new ArrayList<>();
    @SerializedName("errors")
    @Expose
    private Object errors;
    @SerializedName("lang")
    @Expose
    private String lang;
    public ArrayList<Content> getContacts() {
        return (ArrayList<Content>) contacts;
    }



    /**
     * @param contacts The contacts
     */
    public void setContacts(ArrayList<Content> contacts) {
        this.contacts = contacts;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }





    public Object getErrors() {
        return errors;
    }

    public void setErrors(Object errors) {
        this.errors = errors;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

}