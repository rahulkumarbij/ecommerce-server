package com.zosh.ecommerce_youtube.com.zosh.service;

import com.zosh.ecommerce_youtube.com.zosh.exception.ProductException;
import com.zosh.ecommerce_youtube.com.zosh.model.Product;
import com.zosh.ecommerce_youtube.com.zosh.model.Review;
import com.zosh.ecommerce_youtube.com.zosh.model.User;
import com.zosh.ecommerce_youtube.com.zosh.repository.ProductRepository;
import com.zosh.ecommerce_youtube.com.zosh.repository.ReviewRepository;
import com.zosh.ecommerce_youtube.com.zosh.request.ReviewRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService{

    private ReviewRepository reviewRepository;
    private ProductService productService;
    private ProductRepository productRepository;

    public ReviewServiceImplementation(ReviewRepository reviewRepository,
                                       ProductService productService,
                                       ProductRepository productRepository){
        this.productRepository=productRepository;
        this.productService=productService;
        this.reviewRepository=reviewRepository;

    }

    @Override
    public Review createReview(ReviewRequest req, User user) throws ProductException {
        Product product=productService.findProductById(req.getProductId());

        Review review=new Review();
        review.setUser(user);
        review.setProduct(product);
        review.setReview(req.getReview());
        review.setCreatedAt(LocalDateTime.now());

        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReview(Long productId) {
        return reviewRepository.getAllProductsReview(productId);
    }
}
