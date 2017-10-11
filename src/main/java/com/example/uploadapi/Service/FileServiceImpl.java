package com.example.uploadapi.Service;
import com.example.uploadapi.Repo.FileRepo;
import com.example.uploadapi.entity.*;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileServiceImpl implements FileService{

    static final String Dir_Loc = "uploadedFiles/";

    @Autowired
    private FileRepo fileRepo;

    public List<File> getAllFiles() {

        List<File> file = new ArrayList<>();
        fileRepo.findAll().forEach(file::add);
        return file;

    }

    public File getFileDetails(int id) {
        return fileRepo.findOne(id);
    }

    public void addFile(MultipartFile filename) throws IllegalStateException, IOException {

        String fName = filename.getOriginalFilename();
        Long fSize = filename.getSize();
        String fExt = fName.substring(fName.lastIndexOf(".")+1);
        LocalDateTime date = LocalDateTime.now();

        String d = Dir_Loc + fName;

        java.io.File file = new java.io.File(d);

        filename.transferTo(new java.io.File(file.getAbsolutePath()));

//        String fileAbsolutePath = file.getAbsolutePath();
//        java.io.File file2 = new java.io.File(fileAbsolutePath);
//
//        filename.transferTo(file2);

        fileRepo.save(new File(fName,fSize, fExt, date));



    }
}
