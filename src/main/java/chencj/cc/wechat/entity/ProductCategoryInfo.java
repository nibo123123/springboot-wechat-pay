package chencj.cc.wechat.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate

public class ProductCategoryInfo {
    @Id
    @GeneratedValue
    private Integer productCategoryId;

    private String productCategoryName;

    private Integer productCategoryTypeId;

    private Date productCreateTime;

    private Date productUpdateTime;

    public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	public Integer getProductCategoryTypeId() {
		return productCategoryTypeId;
	}

	public void setProductCategoryTypeId(Integer productCategoryTypeId) {
		this.productCategoryTypeId = productCategoryTypeId;
	}

	public Date getProductCreateTime() {
		return productCreateTime;
	}

	public void setProductCreateTime(Date productCreateTime) {
		this.productCreateTime = productCreateTime;
	}

	public Date getProductUpdateTime() {
		return productUpdateTime;
	}

	public void setProductUpdateTime(Date productUpdateTime) {
		this.productUpdateTime = productUpdateTime;
	}

	public ProductCategoryInfo() {
    }

    public ProductCategoryInfo(String productCategoryName, Integer productCategoryTypeId) {
        this.productCategoryName = productCategoryName;
        this.productCategoryTypeId = productCategoryTypeId;
    }

    @Override
    public String toString() {
        return "ProductCategoryInfo [productCategoryId=" + productCategoryId + ", productCategoryName="
                + productCategoryName + ", productCategoryTypeId=" + productCategoryTypeId + "]";
    }
}
