package me.june.food.domain.option;

import lombok.Getter;
import me.june.food.base.BaseEntity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

// TODO 기본형 옵션 그룹은 반드시 하나만 존재해야 한다.
@Getter
@Entity
@DiscriminatorValue(MenuOptionGroup.Type.BASIC)
public class BasicMenuOptionGroup extends BaseEntity {

}
