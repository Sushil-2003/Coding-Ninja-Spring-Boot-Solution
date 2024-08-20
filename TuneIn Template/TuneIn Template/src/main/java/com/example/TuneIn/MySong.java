package com.example.TuneIn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MySong implements Song {
    private String name;

    @Override
    public String getSongName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
