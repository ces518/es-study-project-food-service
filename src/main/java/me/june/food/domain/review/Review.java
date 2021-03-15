package me.june.food.domain.review;

import me.june.food.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reviews")
public class Review extends BaseEntity {
    private String title;
    private int rating;
    private Long storeId;
    private Long menuId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "review_id")
    private List<ReviewImage> imageUrls;
}
