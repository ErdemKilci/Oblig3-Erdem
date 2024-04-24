package com.example.kinobillett;

import com.example.kinobillett.KinoBillett;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KinoBillettController {


    @Autowired
    public KinoBillettRepository rep;


    @PostMapping("/save")
    public void saveTicket(KinoBillett ticket) {
        rep.saveTicket(ticket);

    }
    @GetMapping("/getAll")
    public List<KinoBillett> getAllTickets() {
        return rep.getAllTickets();
    }

    @GetMapping("/deleteAll")
    public void deleteAllTickets() {
        rep.deleteAllTickets();
    }


}



