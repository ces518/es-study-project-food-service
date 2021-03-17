package me.june.food.domain.option;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

// TODO 추가 옵션 그룹은 0개 이상 존재한다.
@Getter
@Entity
@DiscriminatorValue(MenuOptionGroup.Type.OPTIONAL)
public class OptionalMenuOptionGroup extends MenuOptionGroup {

}
