package ops.model.X.file.system.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author tongzhuhe
 * @Date 2019/2/20
 * @Version 1.0.1
 */
@RestController
public class FileController {

    @Value("${file.path:c://}")
    private String path;

    @Value("${file.prefix:n}")
    private String prefix;

    @PostMapping(value = "/files/upload")
    public String fileUp(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request) {
        String fileName = file.getOriginalFilename();  // 文件名
        if (fileName == null) {
            throw new RuntimeException("文件名字不能为空");
        }
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(path + "/" + fileName);
        File dirs = new File(path);
        if (!dirs.exists()) {
            dirs.mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        if (prefix.equals("n")) {
            return "http://" + request.getServerName() + ":" + request.getServerPort() + "/model/image/" + fileName;
        }
        return prefix + "/model/image/" + fileName;
    }

}
