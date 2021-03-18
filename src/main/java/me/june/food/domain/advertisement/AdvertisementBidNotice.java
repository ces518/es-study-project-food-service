package me.june.food.domain.advertisement;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;
import me.june.food.base.TimePeriod;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "advertisement_bid_notices")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AdvertisementBidNotice extends BaseEntity {
	// 광고 타입
	enum Type {
		// 오픈리스트
		OPEN_LIST,
		// 울트라콜
		ULTRA_CALL,
		;
	}

	// 광고 타입
	@Column(nullable = false)
	private Type type;

	// 광고 가능한 최대 스토어수
	@Column(nullable = false)
	private int maximumStoreCounts;

	// 최소 입찰 금액
	@Column(nullable = false)
	private Money minimumBidPrice;

	// 입찰 단위
	@Column(nullable = false)
	private Money bidPriceUnit;

	// 광고 기간
	@AttributeOverrides(
		@AttributeOverride(name = "from", column = @Column(name = "ad_start_at", nullable = false)),
		@AttributeOverride(name = "to", column = @Column(name = "ad_end_at", nullable = false))
	)
	private TimePeriod period = TimePeriod.EMPTY;

	// 광고 입찰 스토어
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "advertisementBidNotice")
	private List<AdvertiseBidStore> advertiseBidStores = List.of();
}
