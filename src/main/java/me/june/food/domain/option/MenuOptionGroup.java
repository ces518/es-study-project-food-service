package me.june.food.domain.option;

import me.june.food.base.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu_option_groups")
public class MenuOptionGroup extends BaseEntity {
    private String name;
    private boolean isOptional;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_option_group_id")
    private List<MenuOption> options;
}
