package me.june.food.domain.menu;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table(name = "menu_groups")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuGroup extends BaseEntity {
	// 메뉴 그룹명
	@Column(nullable = false)
	private String name;

	// 그룹 설명
	private String description;

	// 관련 메뉴
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
	private List<Menu> menus = List.of();
}
