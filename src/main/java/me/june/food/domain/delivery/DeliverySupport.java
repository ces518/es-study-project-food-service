package me.june.food.domain.delivery;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "delivery_supports")
public class DeliverySupport extends BaseEntity {
    private String city;
    private String street;
    private LocalDateTime deliveryTime;
    private Long storeId;
}
