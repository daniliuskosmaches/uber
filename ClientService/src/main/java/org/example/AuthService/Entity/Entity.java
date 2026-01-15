package org.example.AuthService.Entity;


import lombok.Data;
import lombok.NonNull;

@Data
public class Entity {
    @NonNull
    private String id;
    private String name;
    private int password;//всегда будет меняться

}
