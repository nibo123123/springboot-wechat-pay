package chencj.cc.wechat.entity;


import lombok.Getter;
import lombok.Setter;

@Getter

public enum ProductInfoStatus {
    UP(1,"1代表上架"),
    DOWN(0,"0代表下架");
    private int status;
    private String message;
    private ProductInfoStatus(int status , String message){
        this.message=message;
        this.status = status;
    }
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
