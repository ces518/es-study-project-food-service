package me.june.food.domain.advertisement;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "advertised_stores")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdvertisedStore extends BaseEntity {
	// 스토어
	@Column(nullable = false)
	private Long storeId;

	// 최종 입찰 가격
	@Column(nullable = false)
	private Money winningBidPrice;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn("advertisements_id")
	private Advertisement advertisement;
}
