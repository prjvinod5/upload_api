package com.example.uploadapi.Controller;
import com.example.uploadapi.Service.FileService;
import com.example.uploadapi.Service.FileServiceImpl;
import com.example.uploadapi.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
public class ResourceController {


    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/files", method = RequestMethod.GET)
    public List<File> listFiles() {
        return fileService.getAllFiles();
    }

    @RequestMapping(value = "/files/{id}", method = RequestMethod.GET)
    public File listFileDetails(@PathVariable int id)  {
        return fileService.getFileDetails(id);
    }

    @RequestMapping(value = "/files",method = RequestMethod.POST)
    public void fileUpload(@RequestParam("filename") MultipartFile filename) throws IllegalStateException, IOException {
       fileService.addFile(filename);
    }




}

