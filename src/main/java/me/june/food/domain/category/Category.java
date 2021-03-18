package me.june.food.domain.category;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.june.food.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "categories")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Category extends BaseEntity {

	@Column(nullable = false)
    private String name;
}
