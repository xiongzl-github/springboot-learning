package com.timebook.Model;

/**
 * The type Error info.
 *
 * @param <T> the type parameter
 */
public class ErrorInfo<T> {

    private int code;

    private String message;

    private T Data;

    /**
     * Gets code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public T getData() {
        return Data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(T data) {
        Data = data;
    }
}
