package chencj.cc.wechat.service;

import chencj.cc.wechat.entity.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    private  ProductInfoServiceImpl productInfoService;
    @Test
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo("543211","方便面",201.12,200,"好吃的方便面123","方便面的图片123123",2,45);

        productInfoService.save(productInfo);
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
        ProductInfo findone = productInfoService.findOne("12345");
        Assert.assertEquals("123456",findone.getProductId());
    }

    @Test
    public void finAll() throws Exception {
    }

    @Test
    public void findAllByProductStatus() throws Exception {
        List<ProductInfo> list = productInfoService.findAllByProductStatus(2);

    }

}