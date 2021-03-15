package me.june.food.domain.favorite;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "favorite_stores")
public class FavoriteStore extends BaseEntity {
    private Long storeId;
}
