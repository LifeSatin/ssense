package study.ssense.entity.item;

import jakarta.persistence.Entity;

@Entity
public class Shoes extends Item{
    private String color;
    private String size;
}
