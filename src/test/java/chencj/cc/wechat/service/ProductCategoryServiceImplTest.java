package chencj.cc.wechat.service;

import chencj.cc.wechat.entity.ProductCategoryInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    @Autowired
    private ProductCategoryServiceInfoImpl productCategoryService;

    @Test

    public void save() throws Exception {
        ProductCategoryInfo productCategoryInfo = new ProductCategoryInfo("这个不错啊真是很不错啊",2);
        productCategoryService.save(productCategoryInfo);
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void findOne() throws Exception {
    }

    @Test
    public void findAll() throws Exception {
    }

    @Test
    public void findByTypeIn() throws Exception {
        List<Integer> types = Arrays.asList(1,2,3,4,5);
        List<ProductCategoryInfo> list = productCategoryService.findByProductCategoryTypeIdIn(types);
        Assert.assertNotEquals(0,list.size());
    }

}