package com.zhouzhou;

import lombok.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Hello implements Serializable {
    private String message;
    private String description;
}
