package org.example.neverbored;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="media")

public class Media implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String title;
    private String type;
    private String linkURL;

    public Media() {}

    public Media(int id, String title, String type, String linkURL) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.linkURL = linkURL;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getLinkURL() { return linkURL; }

    public void setLinkURL(String linkURL) { this.linkURL = linkURL; }

    @Override
    public String toString() {
        return id +
                ", Title: " + title +
                ", Type: " + type +
                ", Link URL: " + linkURL;
    }
}