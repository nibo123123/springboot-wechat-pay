package chencj.cc.wechat.entity;

import lombok.Data;

@Data
public class ResultV0<T>
        /*请求 响应的结果，Javabean从json格式转化*/
{

    private Integer code;
    private String msg;
    private T data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
