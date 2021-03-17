package me.june.food.domain.advertisement;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdvertiseBidStore extends BaseEntity {

	// 스토어
	@Column(nullable = false)
	private Long storeId;

	// 입찰 금액
	@Column(nullable = false)
	private Money bidPrice;
}
