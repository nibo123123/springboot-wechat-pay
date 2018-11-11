package chencj.cc.wechat.reposity;

import chencj.cc.wechat.entity.ProductCategoryInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryInfoRepository repository;
    @Test
    public void findOneTest(){
        ProductCategoryInfo productCategoryInfo = repository.findById(1).get();
        System.out.println(productCategoryInfo.toString());
    }
    @Test
    public void saveTest(){
        ProductCategoryInfo productCategoryInfo = new ProductCategoryInfo("12345这个很不错",4);
        repository.save(productCategoryInfo);
        //System.out.println(productCategoryInfo.toString());
    }
}