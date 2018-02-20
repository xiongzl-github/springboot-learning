package com.timebook.exception;

/**
 * The type My exception.
 *
 * @title: MyException
 * @author: xiongzl
 * @date: 2018 /2/20
 * @descprition: 自定义异常
 */
public class MyException extends Exception{

    private String msg;

    private String code;

    /**
     * Gets msg.
     *
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets msg.
     *
     * @param msg the msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Instantiates a new My exception.
     *
     * @param code the code
     * @param msg  the msg
     */
    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
