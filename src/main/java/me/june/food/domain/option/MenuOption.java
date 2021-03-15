package me.june.food.domain.option;

import me.june.food.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "menu_options")
public class MenuOption extends BaseEntity {
    private String name;
    private BigDecimal optionPrice;
}
