package com.noirix.controller.responces;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {

    private Long errorId;

    private String errorMessage;
}