package com.example.uploadapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
//@Table(name= "FileDetails")
public class File {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="Id")
    private int id;

    //@Column(name="FileName")
    private String fileName;

    private Long fileSize;

    //@Column(name="FileExtn")
    private String fileExtn;

    //@Column(name = "UploadDate")
    private LocalDateTime uploadDate;

    public File() {

    }

    public File(String fileName, Long fileSize, String fileExtn, LocalDateTime uploadDate) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.fileExtn = fileExtn;
        this.uploadDate = uploadDate;
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileExtn() {
        return fileExtn;
    }

    public void setFileExtn(String fileExtn) {
        this.fileExtn = fileExtn;
    }


    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    @Override
    public String toString() {
        return "File [File ID:" + id + ", File Name:" + fileName + " File Extension: " + fileExtn + " Upload Date: +" +uploadDate;
    }

}
