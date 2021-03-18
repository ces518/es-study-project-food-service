package me.june.food.domain.menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;
import me.june.food.domain.category.Category;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "menus")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseEntity {
	// 스토어
	@Column(nullable = false)
	private Long storeId;

	// 메뉴 명
	@Column(nullable = false)
    private String name;

    // 메뉴 이미지
	private String imageUrl;

    // 설명
    private String description;

    // 기본 판매 가격 Converter 정의 필요
	@Column(nullable = false)
    private Money price;

    // 대표 메뉴 여부
	@Column(nullable = false)
    private boolean isMain = Boolean.FALSE;

    // 인기 메뉴 여부
	@Column(nullable = false)
    private boolean isBest = Boolean.FALSE;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_group_id", nullable = false)
	private MenuGroup group;

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriy_id", nullable = false)
	private Category category;
}
