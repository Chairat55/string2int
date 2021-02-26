package com.test.string2int.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/home")
public class HomeController {

    Pattern pattern = Pattern.compile("^[0-9]");

    @GetMapping("/{stringToInt}")
    public int stringToInt (
            @PathVariable("stringToInt") String stringToInt
    ) {
        // remove string
        StringBuilder rmStr = new StringBuilder();
        for (int i=0 ; i<stringToInt.length() ; i++) {
            String sub = stringToInt.substring(i, i+1);

            if (pattern.matcher(sub).matches()) {
                rmStr.append(sub);
            }
        }

        // convert string to int
        List<Integer> numArrs = new ArrayList<>();
        if (rmStr.length() > 0) {
            for (int j=0 ; j<rmStr.length() ; j++) {
                String sub = rmStr.substring(j, j+1);

                for (int k=0 ; k<9 ; k++) {
                    if (sub.equals("" + k)) {
                        numArrs.add(k);
                    }
                }
            }
        }

        // get result
        int result = 0;
        for (Integer numArr : numArrs) {
            result = result * 10 + numArr;
        }

        return result;
    }
}
