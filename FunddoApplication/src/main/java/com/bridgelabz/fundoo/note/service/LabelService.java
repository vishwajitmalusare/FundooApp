package com.bridgelabz.fundoo.note.service;

import com.bridgelabz.fundoo.note.dto.LabelDTO;
import com.bridgelabz.fundoo.response.Response;

public interface LabelService {
	
	public Response createLabel(LabelDTO labelDto, String token);
	

}
