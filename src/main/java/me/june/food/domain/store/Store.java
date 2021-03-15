package me.june.food.domain.store;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "stores")
public class Store extends BaseEntity {
    private String name;
    private BigDecimal minOrderPrice;
}
