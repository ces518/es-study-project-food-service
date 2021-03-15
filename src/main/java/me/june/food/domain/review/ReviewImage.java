package me.june.food.domain.review;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "review_images")
public class ReviewImage extends BaseEntity {
    private String url;
}
