package com.status.Status.controller;

import com.status.Status.model.*;
import com.status.Status.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "status")
public class Controller {

    @Autowired
    private StatusService statusService;

    @RequestMapping("/create")
    public String create(@RequestParam int statusid, @RequestParam String uname, @RequestParam String userid, 
    		@RequestParam String statusurl, @RequestParam String caption, @RequestParam String pagesize) {
        Statusy status = statusService.create(statusid, uname, userid, statusurl, caption, pagesize);
        return status.toStatusString();
    }
    
    @RequestMapping("/reply")
    public String create(@RequestParam int statusid, @RequestParam String uname,
    		@RequestParam String comment, @RequestParam String commentid) {
    	Statusy status = statusService.create(statusid, uname, comment, commentid);
        return status.toReplyString();
    }

	@RequestMapping("/get")
    public Statusy getStatus(@RequestParam int statusid) {
        return statusService.getStatusById(statusid);
    }

    @GetMapping
    public List<Statusy> getAll() {
        return statusService.getAll();
    }
    
    @RequestMapping("/comments")
    public List<Statusy> getComments() {
        return statusService.getAll();
    }

    @RequestMapping("/update")
    public String update(@RequestParam String uname,@RequestParam String caption,@RequestParam int statusid) {
        Statusy status = statusService.update(uname, caption, statusid);
        return status.toStatusString();
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam int statusid) {
        statusService.delete(statusid);
        return "Deleted "+statusid;
    }

    @RequestMapping("/deleteAll")
    public String deleteAll() {
        statusService.deleteAll();
        return "Deleted all records";
    }
}

