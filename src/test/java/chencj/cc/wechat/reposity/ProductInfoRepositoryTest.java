package chencj.cc.wechat.reposity;

import chencj.cc.wechat.entity.ProductInfo;
import chencj.cc.wechat.entity.ProductInfoStatus;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo("123456789","方便面",201.12,200,"好吃的方便面","方便面的图片", ProductInfoStatus.UP.getStatus(),4);
        ProductInfo productInfo1 = repository.save(productInfo);


    }
}