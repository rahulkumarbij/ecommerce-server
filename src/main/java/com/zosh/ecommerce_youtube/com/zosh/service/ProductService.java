package com.zosh.ecommerce_youtube.com.zosh.service;

import com.zosh.ecommerce_youtube.com.zosh.exception.ProductException;
import com.zosh.ecommerce_youtube.com.zosh.model.Product;
import com.zosh.ecommerce_youtube.com.zosh.model.Size;
import com.zosh.ecommerce_youtube.com.zosh.request.CreateProductRequest;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    public Product createProduct(CreateProductRequest req);

    public String deleteProduct(Long productId) throws ProductException;

    public Product updateProduct(Long productId,Product req)throws ProductException;

    public Product findProductById(Long id)throws ProductException;

    public List<Product> findProductByCategory(String category);

    public Page<Product>getAllProduct(String category, List<String>colors, List<String>sizes,Integer minPrice,Integer maxPrice,
                                      Integer minDiscount,String sort,String stock,Integer pageNumber,Integer pageSize);
}
