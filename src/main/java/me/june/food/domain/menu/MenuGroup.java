package me.june.food.domain.menu;

import me.june.food.base.BaseEntity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "menu_groups")
public class MenuGroup extends BaseEntity {
    private String description;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_group_id")
    private List<Menu> menus;
}
