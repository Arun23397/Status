package com.status.Status.service;

import com.status.Status.model.*;
import com.status.Status.repository.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    
    @Autowired
    private RestRepository repository;

    public Statusy create(int statusid, String uname, String userid, String statusurl, String caption, String pagesize) {
 
    	return repository.save(new Statusy(statusid,uname, userid, statusurl, caption, pagesize));
    }
    
    public Statusy create(int statusid, String uname, String comment, String commentid) {
        return repository.save(new Statusy(statusid, uname, comment, commentid));
    }

    public List<Statusy> getAll() {
        return repository.findAll();
    }

    public Statusy getStatusById(int statusid) {
        return repository.findByStatusId(statusid);
    }

    public Statusy update(String uname, String caption, int statusid) {
        Statusy status = repository.findByStatusId(statusid);
        status.setUname(uname);
        status.setCaption(caption);
        return repository.save(status);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public void delete(int statusid) {
        Statusy status = repository.findByStatusId(statusid);
        repository.delete(status);
    }
}


