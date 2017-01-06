package com.project.kzstartup.model;

/**
 * Created by onuchin on 31.12.2016.
 */


import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("date_ad")
    @Expose
    private String dateAd;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("current_date")
    @Expose
    private String currentDate;
    @SerializedName("visible")
    @Expose
    private String visible;
    @SerializedName("archive")
    @Expose
    private String archive;
    @SerializedName("committee_id")
    @Expose
    private String committeeId;
    @SerializedName("view")
    @Expose
    private String view;
    @SerializedName("visit")
    @Expose
    private String visit;
    @SerializedName("is_send")
    @Expose
    private String isSend;
    @SerializedName("annotation")
    @Expose
    private String annotation;
    @SerializedName("important")
    @Expose
    private String important;
    @SerializedName("show_lang")
    @Expose
    private String showLang;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("break")
    @Expose
    private String _break;
    @SerializedName("images")
    @Expose
    private List<String> images = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateAd() {
        return dateAd;
    }

    public void setDateAd(String dateAd) {
        this.dateAd = dateAd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public String getCommitteeId() {
        return committeeId;
    }

    public void setCommitteeId(String committeeId) {
        this.committeeId = committeeId;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getImportant() {
        return important;
    }

    public void setImportant(String important) {
        this.important = important;
    }

    public String getShowLang() {
        return showLang;
    }

    public void setShowLang(String showLang) {
        this.showLang = showLang;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBreak() {
        return _break;
    }

    public void setBreak(String _break) {
        this._break = _break;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

}

