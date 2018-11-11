package chencj.cc.wechat.service;

import chencj.cc.wechat.entity.ProductCategoryInfo;

import java.io.Serializable;
import java.util.List;

public interface ProductCategoryInfoService {
    public void save(ProductCategoryInfo productCategoryInfo);


    public void delete(Integer id);

    public ProductCategoryInfo findOne(Integer id);

    public List<ProductCategoryInfo> findAll();

    public  List<ProductCategoryInfo> findByProductCategoryTypeIdIn(List<Integer> types);

}
