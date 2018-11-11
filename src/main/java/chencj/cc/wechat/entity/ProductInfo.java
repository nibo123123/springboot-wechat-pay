package chencj.cc.wechat.entity;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@DynamicUpdate

public class ProductInfo {
    @Id
    private  String productId;
    private  String productName;
    private  Double productPrice;
    private  Integer productStock;
    private  String productDescription;
    private String productIcon;
    private Integer productStatus;
    private  Integer productCategoryTypeId;
    private Date productCreateTime;

    private Date productUpdateTime;

//     `product_stock` int(11) NOT NULL,
//  `product_description` varchar(64) COLLATE utf8mb4_bin DEFAULT NULL,
//  `product_icon` varchar(512) COLLATE utf8mb4_bin DEFAULT NULL,
//  `product_status` tinyint(3) DEFAULT '0',
//            `product_category_type_id` int(11) NOT NULL,
//  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//  `update_time` timestamp NOT NU

    public ProductInfo() {
    }
    
    public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductIcon() {
		return productIcon;
	}

	public void setProductIcon(String productIcon) {
		this.productIcon = productIcon;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
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

	public ProductInfo(String productId, String productName, Double productPrice, Integer productStock, String productDescription, String productIcon,Integer productStatus, Integer productCategoryTypeId) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productDescription = productDescription;
        this.productIcon = productIcon;
        this.productStatus = productStatus;
        this.productCategoryTypeId = productCategoryTypeId;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productDescription='" + productDescription + '\'' +
                ", productIcon='" + productIcon + '\'' +
                ", productStatus=" + productStatus +
                ", productCreateTime=" + productCreateTime +
                ", productUpdateTime=" + productUpdateTime +
                '}';
    }
}
