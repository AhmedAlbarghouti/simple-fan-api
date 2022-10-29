package com.example.simplefan;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class FanController {

    private Fan fan = new Fan();


    @GetMapping()
    @ResponseBody
    public ResponseEntity getInfo(){
        return new ResponseEntity(fan, HttpStatus.OK);
    }

    @GetMapping("/pullSpeedCord")
    public ResponseEntity pullSpeedCord(){
        fan.pullSpeedCord();
        return new ResponseEntity<>("Speed is now " +fan.getSpeed(),HttpStatus.OK);
    }

    @GetMapping("/pullReverseCord")
    public ResponseEntity pullReverseCord(){
        fan.pullReverseCord();
        return new ResponseEntity<>("Reverse mode is now "+fan.getReverse(),HttpStatus.OK);
    }


    @GetMapping("/reset")
    public ResponseEntity resetFan(){
        fan.reset();
        return new ResponseEntity<>("Fan reset!",HttpStatus.OK);
    }

}
