package me.june.food.domain.delivery;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "delivery_tips")
public class DeliveryTip extends BaseEntity {
    private BigDecimal price;
    private Long storeId;

    @ManyToOne(fetch = FetchType.LAZY)
    private DeliverySupport location;
}
