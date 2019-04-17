package com.example.ex190417.service;

import java.util.List;

import com.example.ex190417.model.dto.GuestbookDTO;

public interface GuestbookService {
	
	public List<GuestbookDTO> list();
	public void insert(GuestbookDTO dto);
	public GuestbookDTO view(int idx);
	public void update(GuestbookDTO dto);
	public void delete(int idx);

}
