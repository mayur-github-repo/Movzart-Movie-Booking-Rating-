package com.mayur.movzart.resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ReviewResource {

    private String movieReview;

    private double rating;

    private Long movieId;
}
