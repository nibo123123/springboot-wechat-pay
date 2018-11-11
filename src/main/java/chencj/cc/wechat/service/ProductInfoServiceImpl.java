package chencj.cc.wechat.service;

import chencj.cc.wechat.entity.ProductInfo;
import chencj.cc.wechat.reposity.ProductInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements  ProductInfoService {
    @Autowired
    private ProductInfoRepository repository;


    @Override
    public void save(ProductInfo productInfo) {
        repository.save(productInfo);
    }

    @Override
    public void delete(ProductInfo productInfo) {
        repository.delete(productInfo);
    }

    @Override
    public ProductInfo findOne(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        Page<ProductInfo> pageInfo = repository.findAll(pageable);
        return pageInfo;
    }

    @Override
    public List<ProductInfo> findAllByProductStatus(Integer status) {
        return repository.findAllByProductStatus(status);
    }

    @Override
    public List<ProductInfo> findAllUpProduct() {
        return findAllByProductStatus(1);
    }
}
