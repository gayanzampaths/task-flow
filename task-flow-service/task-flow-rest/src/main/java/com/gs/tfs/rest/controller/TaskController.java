package com.gs.tfs.rest.controller;

import com.gs.tfs.rest.model.res.ResponsePack;
import com.gs.tfs.rest.model.task.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;

/**
 * author: gayan
 * created: 2023-09-24
 **/
@Controller
@RequestMapping("/task")
public class TaskController
{
    @PostMapping("/")
    public ResponseEntity<ResponsePack<Void>> addTask(@RequestBody Task task)
    {
        System.out.println(task.toString());
        return ResponseEntity.ok(new ResponsePack<>(1, "Task added successfully.", null));
    }

    @GetMapping("/")
    public ResponseEntity<ResponsePack<List<Task>>> fetchAllTasks()
    {
        return ResponseEntity.ok( new ResponsePack<>( 1, "Available all tasks are fetched.", Collections.emptyList()) );
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<ResponsePack<Task>> fetchTaskViaTaskId(@RequestParam String taskId)
    {
        return ResponseEntity.ok( new ResponsePack<>( 1, "Task Fetch for id: " + taskId, new Task() ) );
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ResponsePack<List<Task>>> fetchTasksViaUserId(@RequestParam long userId, @RequestParam String userType)
    {
        return ResponseEntity.ok(new ResponsePack<>(1, "All tasks fetch for userId" + userId, Collections.emptyList()));
    }
}
