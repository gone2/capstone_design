package com.jiwon.project.dto;

import lombok.Data;

@Data
public class ClassDto {
    private int classNum;
    private String className;
    private String classOutline;
    private String classContents;
    
    public int getClassNum() {
        return classNum;
    }
    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassOutline() {
        return classOutline;
    }
    public void setClassOutline(String classOutline) {
        this.classOutline = classOutline;
    }
    
    public String getClassContents() {
        return classContents;
    }
    public void setClassContents(String classContents) {
        this.classContents = classContents;
    }
}