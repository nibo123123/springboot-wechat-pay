package chencj.cc.wechat.reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import chencj.cc.wechat.entity.ProductCategoryInfo;

public interface ProductCategoryReposity extends JpaRepository<ProductCategoryInfo, Integer>{

}
