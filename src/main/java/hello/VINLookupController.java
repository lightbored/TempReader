package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VINLookupController {

    @RequestMapping("/vinlookup")
    public VINLookup vinlookup(@RequestParam(value="vin", defaultValue="World") String vin) {
        return new VINLookup(String.format(vin));
    }
}