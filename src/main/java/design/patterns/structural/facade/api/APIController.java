package design.patterns.structural.facade.api;

import design.patterns.structural.facade.application.FileUploader;

import java.io.File;

public class APIController {
    public void uploadFile(File file) throws Exception {
        fileUploader.upload(file);
    }

    //@Autowired
    FileUploader fileUploader;
}
