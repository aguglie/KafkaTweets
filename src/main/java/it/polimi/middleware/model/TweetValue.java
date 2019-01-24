package it.polimi.middleware.model;

import java.util.Collections;
import java.util.List;

public class TweetValue implements TimestampedEvent {
    private String author;
    private String content;
    private long timestamp;
    private String location;
    private List<String> tags = Collections.emptyList();
    private List<String> mentions = Collections.emptyList();

    public TweetValue(String author, String content, long timestamp, String location) {
        this.author = author;
        this.content = content;
        this.timestamp = timestamp;
        this.location = location;
    }

    @Override
    public String toString() {
        return "TweetValue{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public void setMentions(List<String> mentions) {
        this.mentions = mentions;
    }
}
