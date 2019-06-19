package com.bridgelabz.fundoo.note.service;


import com.bridgelabz.fundoo.note.dto.NoteDTO;
import com.bridgelabz.fundoo.response.Response;

public interface NoteService {

	public Response createNote(NoteDTO notedto, String token);
	
}