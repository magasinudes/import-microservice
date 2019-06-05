package importCSV;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ImportCSVController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Import CSV index!<h1>";
    }

    @RequestMapping("/health")
    public String health() {
        return "ok";
    }

}
