package com.example.application.endpoints.helloreact;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity

public class Todo {
    private String task;
    private boolean done;
}
