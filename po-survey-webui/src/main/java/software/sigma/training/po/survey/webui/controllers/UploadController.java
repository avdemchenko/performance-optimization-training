package software.sigma.training.po.survey.webui.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import software.sigma.training.po.survey.services.api.CSVProcessorService;

import java.io.IOException;
import java.util.Objects;

@Controller
public class UploadController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    private CSVProcessorService csvProcessorService;

    @GetMapping("/")
    public String homepage() {
        return "index";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file")MultipartFile file, RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select file to upload");
            return "redirect:/";
        }
        String fileName = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));

        long startTime = System.currentTimeMillis();
        try {
            csvProcessorService.process(file.getInputStream());
            long endTime = System.currentTimeMillis();
            redirectAttributes.addFlashAttribute("message", "You successfully uploaded " + fileName + ". Processing time " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            LOGGER.error("Error during file upload", e);
            redirectAttributes.addFlashAttribute("message", "Upload error: " + e.getLocalizedMessage());
            return "redirect:/";
        }

        return "redirect:/";
    }

}
