package chencj.cc.wechat.controller;


import chencj.cc.wechat.entity.*;
import chencj.cc.wechat.service.ProductCategoryInfoService;
import chencj.cc.wechat.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
// 访问的url路径的前缀
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductCategoryInfoService productCategoryInfoService;
    @Autowired
    private ProductInfoService productInfoService;
    @RequestMapping("/list")
    public ResultV0 list(){
        ResultV0 rRResult = new ResultV0();
        rRResult.setCode(0);
        rRResult.setMsg("chenggong");

        List<ProductInfo> allUpProduct = productInfoService.findAllUpProduct();
        List<Integer> types = new ArrayList<>();
        for(ProductInfo productInfo : allUpProduct){
            Integer typeId = productInfo.getProductCategoryTypeId();
            types.add(typeId);
        }

        List<ProductCategoryInfo> categoryTypeIdIn = productCategoryInfoService.findByProductCategoryTypeIdIn(types);

        List<ProductCategoryInfoV0> productCategoryInfoV0s = new ArrayList<>();

        for(ProductCategoryInfo productCategoryInfo : categoryTypeIdIn){
            ProductCategoryInfoV0 productCategoryInfoV0 = new ProductCategoryInfoV0();

            productCategoryInfoV0.setProductCategoryName(productCategoryInfo.getProductCategoryName());
            productCategoryInfoV0.setProductCategoryType(productCategoryInfo.getProductCategoryTypeId());
            productCategoryInfoV0.setProductCategoryId(productCategoryInfo.getProductCategoryId());

            List<ProductInfoV0> productInfoV0s = new ArrayList<>();
            for(ProductInfo productInfo : allUpProduct){
                if(productCategoryInfo.getProductCategoryTypeId()==productInfo.getProductCategoryTypeId())
                {
                    ProductInfoV0 productInfoV0 = new ProductInfoV0();

                    productInfoV0.setProductPrice(productInfo.getProductPrice());
                    productInfoV0.setProductName(productInfo.getProductName());
                    productInfoV0.setProductIcon(productInfo.getProductIcon());
                    productInfoV0.setProductDescription(productInfo.getProductDescription());
                    productInfoV0.setProductId(productInfo.getProductId());

                    productInfoV0s.add(productInfoV0);

                }
            }
            productCategoryInfoV0.setProductInfoV0s(productInfoV0s);
            productCategoryInfoV0s.add(productCategoryInfoV0);
        }






        rRResult.setData(productCategoryInfoV0s);
        return rRResult;
    }
}
