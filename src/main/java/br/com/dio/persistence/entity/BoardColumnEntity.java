package br.com.dio.persistence.entity;

import lombok.Data;
import lombok.ToString;

@Data
public class BoardColumnEntity {

    private Long id;
    private String name;
    private int order;
    private BoardColumnKindEnum kind;
    @ToString.Exclude
    private  BoardEntity board = new BoardEntity();
}
