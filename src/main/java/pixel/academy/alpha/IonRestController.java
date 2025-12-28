package pixel.academy.alpha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IonRestController {

    @GetMapping("/ion")
    public String getIon() {
        return "Ion";
    }
}
