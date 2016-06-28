package me.xiaochutian.entity;
import org.springframework.stereotype.Component;

@Component
public class ReturnJson {

    String result;
    String message;
    Object data;

    //默认构造方法为成功
    public ReturnJson() {
        super();
        result = "0";
        message = "success";
        data = "";
    }

    public ReturnJson(String result, String message, Object data) {
        super();
        this.result = result;
        this.message = message;
        this.data = data;
    }

    public void reset() {
        result = "0";
        message = "success";
        data = "";
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
