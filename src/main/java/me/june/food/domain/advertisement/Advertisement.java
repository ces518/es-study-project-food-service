package me.june.food.domain.advertisement;

import lombok.Getter;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "advertisements")
public class Advertisement extends BaseEntity {
	// 오픈리스트 / 울트라콜 두가지로 나뉜다.
	// 광고는 입찰로 이루어진다.
	// 광고는 지원하는 지역이 있다. (동 또는 구 단위)
	// 광고를 걸수 있는 스토어 수는 제한된다.
	// 광고 입찰에 성공한 스토어는 검색시 상단에 노출된다.
	// 광고는 관리자가 공고를 낼 수 있다.
	// 광고 기간은 기본적으로 월 단위이다.
	// 최소 입찰 금액이 존재한다.
	// 입찰 단위가 존재한다.

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

	// 광고 시작일
	@Column(nullable = false)
	private LocalDateTime from;

	// 광고 종료일
	@Column(nullable = false)
	private LocalDateTime to;
}
