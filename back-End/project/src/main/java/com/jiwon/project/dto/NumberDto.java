package com.jiwon.project.dto;

import lombok.Data;

@Data
public class NumberDto {
    private int classKey;

    public int getNumber() {
        return classKey;
    }
    public void setNumber(int classKey) {
        this.classKey = classKey;
    }
}