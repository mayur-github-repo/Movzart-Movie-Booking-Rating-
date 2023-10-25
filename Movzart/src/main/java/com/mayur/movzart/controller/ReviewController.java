package com.mayur.movzart.controller;

import com.mayur.movzart.domain.Review;
import com.mayur.movzart.resource.ReviewResource;
import com.mayur.movzart.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public void addReview(@RequestBody ReviewResource reviewRequest){
        reviewService.addReview(Review.toEntity(reviewRequest));
    }

    @GetMapping("/find")
    public ReviewResource getReview(@RequestParam Long reviewId){
        return reviewService.getReviewById(reviewId);
    }
}
