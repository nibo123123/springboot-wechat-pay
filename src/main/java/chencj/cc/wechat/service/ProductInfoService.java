package chencj.cc.wechat.service;

import chencj.cc.wechat.entity.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {
    /**
     * 商家查询所有
     * 客户查询上架的status
     *
     * 增库存
     * 减库存
     * @param productInfo
     */
    public void save(ProductInfo productInfo);

    public void delete(ProductInfo productInfo);

    public ProductInfo findOne(String id);

    public Page<ProductInfo> findAll(Pageable pageable);

    public List<ProductInfo> findAllByProductStatus(Integer status);

    public List<ProductInfo> findAllUpProduct();
}
