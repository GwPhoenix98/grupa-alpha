package pixel.academy.alpha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VasileRestController {

    @GetMapping("/Vasile")
    public String getVasile(){
        return "Vasile";
    }
}
