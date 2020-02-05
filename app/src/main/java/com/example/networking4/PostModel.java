package com.example.networking4;

public class PostModel {

    public String id;

    public String url;

    public String comments;
    public String title;
    public String slug;
    public String image;
    public String body;
    public String created;
    public String updated;

    public String dataId;
    public String dataUrl;
    public String dataName;
    public String dataEmail;
    public String dataEmailVerif;
    public String dataCreate;
    public String dataUpdate;

    String total;
    String count;
    String perPage;
    String currentPage;
    String totalPage;
    String next;


    public PostModel(String id, String url, String comments, String title, String slug, String image, String body, String created, String updated, String dataId, String dataUrl, String dataName, String dataEmail, String dataEmailVerif, String dataCreate, String dataUpdate, String total, String count, String perPage, String currentPage, String totalPage, String next) {
        this.id = id;
        this.url = url;
        this.comments = comments;
        this.title = title;
        this.slug = slug;
        this.image = image;
        this.body = body;
        this.created = created;
        this.updated = updated;
        this.dataId = dataId;
        this.dataUrl = dataUrl;
        this.dataName = dataName;
        this.dataEmail = dataEmail;
        this.dataEmailVerif = dataEmailVerif;
        this.dataCreate = dataCreate;
        this.dataUpdate = dataUpdate;
        this.total = total;
        this.count = count;
        this.perPage = perPage;
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        this.next = next;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
    }

    public String getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(String totalPage) {
        this.totalPage = totalPage;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public String getDataEmail() {
        return dataEmail;
    }

    public void setDataEmail(String dataEmail) {
        this.dataEmail = dataEmail;
    }

    public String getDataEmailVerif() {
        return dataEmailVerif;
    }

    public void setDataEmailVerif(String dataEmailVerif) {
        this.dataEmailVerif = dataEmailVerif;
    }

    public String getDataCreate() {
        return dataCreate;
    }

    public void setDataCreate(String dataCreate) {
        this.dataCreate = dataCreate;
    }

    public String getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(String dataUpdate) {
        this.dataUpdate = dataUpdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }
}