package chencj.cc.wechat.reposity;

import chencj.cc.wechat.entity.ProductCategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryInfoRepository extends JpaRepository<ProductCategoryInfo,Integer> {
    public List<ProductCategoryInfo> findByProductCategoryTypeIdIn(List<Integer> types);
}
