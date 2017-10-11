package com.example.uploadapi.Service;

import com.example.uploadapi.entity.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {


    File getFileDetails(int id);

    List<File> getAllFiles();

    void addFile(MultipartFile filename) throws IOException;

}
