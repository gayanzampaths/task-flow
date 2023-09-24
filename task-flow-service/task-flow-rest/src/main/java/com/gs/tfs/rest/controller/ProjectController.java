package com.gs.tfs.rest.controller;

import com.gs.tfs.rest.model.res.ResponsePack;
import com.gs.tfs.rest.model.task.Project;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * author: gayan
 * created: 2023-09-24
 **/
@Controller
@RequestMapping("/project")
public class ProjectController
{
    @PostMapping("/")
    public ResponseEntity<ResponsePack<Void>> addProject(@RequestBody Project project)
    {
        return ResponseEntity.ok( new ResponsePack<>( 1, "Project Added successfully.", null ) );
    }

    @GetMapping("/")
    public ResponseEntity<ResponsePack<Project>> fetchProject(@RequestParam long projectId)
    {
        return ResponseEntity.ok( new ResponsePack<>(1, "Fetch project details for projectId: " + projectId, new Project()) );
    }
}
