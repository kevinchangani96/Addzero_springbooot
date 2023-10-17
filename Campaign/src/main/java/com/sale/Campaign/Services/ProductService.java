package com.sale.Campaign.Services;

import com.sale.Campaign.Model.Product;
import com.sale.Campaign.Model.dto.ProductDto;
import com.sale.Campaign.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> addProduct(List<Product> products) {
        return productRepo.saveAll(products);
    }

    public ProductDto getListByPageNumber(Integer pageNo, Integer pageSize) {
        Page<Product> productPage = productRepo.findAll(PageRequest.of(pageNo - 1, pageSize));

        List<Product> productList = productPage.getContent();
        int totalPage = ((Page<?>) productPage).getTotalPages();

        ProductDto ans = new ProductDto();
        ans.setProduct(productList);
        ans.setPage(pageNo);
        ans.setTotalPage(totalPage);
        ans.setPageSize(pageSize);

        return ans;






//        List<Product> getAll = productRepo.findAll();
//        int pageno = 1;
//        List<Product> list = new ArrayList<>();
//        for (Product p : getAll) {
//            if (list.size() == pageSize) {
//                if (pageno == pageNo) {
//                    break;
//                }
//                pageno++;
//                list.clear();
//            }
//            list.add(p);
//        }
//
//        double result = (double) getAll.size() / pageSize;
//        int totalpage = (int) Math.ceil(result);
//
//        ProductDto ans = new ProductDto();
//        ans.setProduct(list);
//        ans.setPage(pageno);
//        ans.setTotalPage(totalpage);
//        ans.setPageSize(pageSize);
//        return ans;
    }
}
