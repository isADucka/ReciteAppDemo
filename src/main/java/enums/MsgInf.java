package enums;

public enum MsgInf {

    OK(200, "OK"),
    NOT_FOUND(404, "资源不存在"),
    UNAUTHORIZED(401, "信息认证失败"),
    SERVER_ERROR(500, "服务器执行时发生错误"),
    SERVICE_UNAVAILABLE(503, "服务器维护中");


    /**
     * 状态码
     */
    private int code;
    /**
     * 响应消息描述
     */
    private String content;

    MsgInf(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
