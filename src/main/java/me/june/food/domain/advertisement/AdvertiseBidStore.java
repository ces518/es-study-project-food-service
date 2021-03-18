package me.june.food.domain.advertisement;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "advertised_bid_stores")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdvertiseBidStore extends BaseEntity {
	// 스토어
	@Column(nullable = false)
	private Long storeId;

	// 입찰 금액
	@Column(nullable = false)
	private Money bidPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn("advertisement_bid_notice_id")
	private AdvertisementBidNotice advertisementBidNotice;
}
