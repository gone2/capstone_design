package com.jiwon.project.dto;

import lombok.Data;

@Data
public class NumberDto {
    private int classKey;

    public int getClassKey() {
        return classKey;
    }
    public void setClassKey(int classKey) {
        this.classKey = classKey;
    }
}