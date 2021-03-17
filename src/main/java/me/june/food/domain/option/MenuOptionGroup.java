package me.june.food.domain.option;

import lombok.Getter;
import me.june.food.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
@Table(name = "menu_option_groups")
abstract class MenuOptionGroup extends BaseEntity {

	abstract static class Type {
		public static final String BASIC = "BASIC";
		public static final String OPTIONAL = "OPTIONAL";
	}

	@Column(nullable = false)
	private String name;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu_option_group_id")
	private List<MenuOption> options = List.of();
}
