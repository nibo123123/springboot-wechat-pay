package chencj.cc.wechat.service;

import chencj.cc.wechat.entity.ProductCategoryInfo;
import chencj.cc.wechat.reposity.ProductCategoryInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryServiceInfoImpl implements ProductCategoryInfoService {
    @Autowired
    private ProductCategoryInfoRepository repository;

    @Override
    public void save(ProductCategoryInfo productCategoryInfo) {
        repository.save(productCategoryInfo);
    }



    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public ProductCategoryInfo findOne(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<ProductCategoryInfo> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategoryInfo> findByProductCategoryTypeIdIn(List<Integer> types) {
        return repository.findByProductCategoryTypeIdIn(types);
    }


}
