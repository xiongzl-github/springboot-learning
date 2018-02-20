package com.timebook.model;

/**
 * The type User.
 *
 * @title: User
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: User对象
 */
public class User {
    private Integer id;

    private String name;

    private String password;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}