package com.bridgelabz.fundoo.note.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoo.note.dto.NoteDTO;
import com.bridgelabz.fundoo.note.service.NoteService;
import com.bridgelabz.fundoo.response.Response;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*", origins = "*")
@PropertySource("classpath:message.properties")
public class NoteController {

	@Autowired
	private NoteService noteService;

	@PostMapping("/createNote")
	public ResponseEntity<Response> creatingNote(@RequestBody NoteDTO noteDto, @RequestHeader String token) {
		System.out.println("NotesController.creatingNote()");
		Response responseStatus = noteService.createNote(noteDto, token);
		return new ResponseEntity<Response>(responseStatus, HttpStatus.OK);
	}
	
}
