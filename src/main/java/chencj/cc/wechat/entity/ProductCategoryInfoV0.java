package chencj.cc.wechat.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class ProductCategoryInfoV0 {
    public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public Integer getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public Integer getProductCategoryType() {
		return productCategoryType;
	}
	public void setProductCategoryType(Integer productCategoryType) {
		this.productCategoryType = productCategoryType;
	}
	public List<ProductInfoV0> getProductInfoV0s() {
		return productInfoV0s;
	}
	public void setProductInfoV0s(List<ProductInfoV0> productInfoV0s) {
		this.productInfoV0s = productInfoV0s;
	}
	@JsonProperty("name")
    private String  productCategoryName;
    @JsonProperty("id")
    private Integer productCategoryId;
    @JsonProperty("type")
    private Integer productCategoryType;
    @JsonProperty("product")
    private List<ProductInfoV0> productInfoV0s;
}
