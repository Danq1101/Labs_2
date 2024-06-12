package org.example.web.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.example.model.User;
import org.hibernate.validator.constraints.Length;

@Data
public class TradeItemDto {

    private Integer id;

    private String addTime;

    private Integer cost;

    private String name;

    private String image;

    private String userEmail;

    private User user;

}
