package chencj.cc.wechat.reposity;

import chencj.cc.wechat.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductInfoRepository extends JpaRepository<ProductInfo ,String>{
    public List<ProductInfo> findAllByProductStatus(Integer status);
}
