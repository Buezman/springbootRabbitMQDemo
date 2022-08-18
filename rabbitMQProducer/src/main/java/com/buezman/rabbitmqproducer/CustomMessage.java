package com.buezman.rabbitmqproducer;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomMessage {
    private String id;
    private String message;
    private Date createdAt;
}
