package com.example.ex190417.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.ex190417.model.dao.GuestbookDAO;
import com.example.ex190417.model.dto.GuestbookDTO;

@Service
public class GuestbookServiceImpl implements GuestbookService {

	@Inject
	GuestbookDAO guestbookDao;
	
	@Override
	public List<GuestbookDTO> list() {
		return guestbookDao.list();
	}

	@Override
	public void insert(GuestbookDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public GuestbookDTO view(int idx) {
		return guestbookDao.view(idx);
	}

	@Override
	public void update(GuestbookDTO dto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int idx) {
		// TODO Auto-generated method stub
	}

}
