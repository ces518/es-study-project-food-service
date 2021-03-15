package me.june.food.domain.menu;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "menus")
public class Menu extends BaseEntity {
    private String name;
    private String description;
    private BigDecimal price;
    private boolean isMain;
    private boolean isBest;
}
