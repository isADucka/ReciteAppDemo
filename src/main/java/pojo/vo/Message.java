package pojo.vo;

import enums.MsgInf;

/**
 * 用于封装响应前端的信息
 */
public class Message<T> {
    /**
     * 响应状态码: 200 404 500等...
     */
    private final int code;

    /**
     * 响应的一些描述
     */
    private final String content;

    /**
     * 响应数据
     */
    private T data;

    public Message() {
        //默认发送成功消息
        this(MsgInf.OK);
    }

    public Message(MsgInf msgInf) {
        this.code = msgInf.getCode();
        this.content = msgInf.getContent();
    }

    public Message(MsgInf msgInf, T data) {
        this.code = msgInf.getCode();
        this.content = msgInf.getContent();
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    public T getData() {
        return data;
    }
}
