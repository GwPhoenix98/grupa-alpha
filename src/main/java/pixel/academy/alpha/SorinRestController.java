package pixel.academy.alpha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SorinRestController {


    @GetMapping("/sorin")
    public String getSorin() {
        return "Sorin";
    }

}
