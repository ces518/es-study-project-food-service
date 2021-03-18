package me.june.food.domain.option;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;
import me.june.food.base.Money;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "menu_options")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuOption extends BaseEntity {
	private static final int MINIMUM_SELECT_DEFAULT = 1;

	// 메뉴 옵션 명
	@Column(nullable = false)
	private String name;

	// 가격 (기본형 그룹일 경우 판매가 / 옵셔널 그룹일 경우 추가가격)
	@Column(nullable = false)
	private Money price;

	// 옵션 최소 선택 개수
	@Column(nullable = false)
	private int minimumSelectCount = MINIMUM_SELECT_DEFAULT;

	// 옵션 최대 선택 개수
	@Column(nullable = false)
	private int maximumSelectCount = MINIMUM_SELECT_DEFAULT;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_option_group_id", nullable = false)
	private MenuOptionGroup optionGroup;
}
