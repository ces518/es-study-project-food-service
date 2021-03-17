package me.june.food.domain.advertisement;

import lombok.Getter;
import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "advertised_stores")
public class AdvertisedStore extends BaseEntity {
}
