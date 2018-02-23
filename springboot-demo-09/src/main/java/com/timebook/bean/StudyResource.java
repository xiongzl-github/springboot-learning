package com.timebook.bean;

import lombok.Data;

/**
 * The type Study resource.
 *
 * @author xiongzl
 */
@Data
public class StudyResource {

    private String author;

    private String title;

    private String url;

    /**
     * Instantiates a new Study resource.
     */
    public StudyResource() {
    }

    /**
     * Instantiates a new Study resource.
     *
     * @param author the author
     * @param title  the title
     * @param url    the url
     */
    public StudyResource(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
