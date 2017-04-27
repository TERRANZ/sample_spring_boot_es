package ru.terra.sample.esboot.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.UUID;

@Document(indexName = "twit", type = "twit")
public class Twit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String guid;
    private String text;
    private String userId;

    public Twit() {
        this.guid = UUID.randomUUID().toString();
    }

    public Twit(String guid, String text, String userId) {
        this.guid = guid;
        this.text = text;
        this.userId = userId;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
