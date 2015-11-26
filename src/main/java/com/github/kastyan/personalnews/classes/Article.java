package com.github.kastyan.personalnews.classes;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "article")
public class Article {


    @Id
    @Column(name = "title", length = 2000)
    private String title;

    @Column(name = "link", length = 2000)
    private String link;

    @Column(name = "pdalink", length = 2000)
    private String pdalink;

    @Column(name = "category")
    private String category;

    @Column(name = "author")
    private String author;

    @Column(name = "pubDate")
    private String pubDate;

    @Column(name = "description", length = 2000)
    private String description;

    @Column(name = "guid", length = 2000)
    private String guid;

    @Embedded
    private Enclosure enclosure;

    @Column(name = "fulltext", length = 5000)
    private String fulltext;

    @XmlElement
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @XmlElement
    public String getPdalink() {
        return pdalink;
    }

    public void setPdalink(String pdalink) {
        this.pdalink = pdalink;
    }

    @XmlElement
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @XmlElement
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @XmlElement
    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @XmlElement
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlElement
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    @XmlElement
    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }

    @XmlElement
    public String getFulltext() {
        return fulltext;
    }

    public void setFulltext(String fulltext) {
        this.fulltext = fulltext;
    }


    @Override
    public String toString() {
       String artToString = "Article /n" + "title: " + this.title + "\n" + "link: " + this.link + "\n" + "pdalink: " + this.pdalink + "\n" + "category: " + this.category + "\n" + "author: " + this.author + "\n" + "pubDate: " + this.pubDate + "\n"+ "description: " + this.description + "\n"+ "guid: " + this.guid + "\n"+ "enclosure: " + this.enclosure + "\n"+ "fulltext: " + this.fulltext + "\n";

        return artToString;
    }
}
