package com.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dao.BookSearchDao;
import com.lms.dao.MemberBookSearchDao;
import com.lms.model.Books;
import com.lms.model.Member;


/**
 * @author nitrawat
 *
 */
@Service
public class BookSearchImpl implements BookSearch {

	@Autowired
	BookSearchDao bookSearchDao;
	
	@Autowired
	MemberBookSearchDao memberBookSearch;

	@Override
	public Books getInputSearch(String id) {
		// TODO Auto-generated method stub
		return bookSearchDao.getInputSearch(id);
	}

	@Override
	public Books getInputSearchName(String name) {
		// TODO Auto-generated method stub
		return bookSearchDao.getInputSearchName(name);
	}

	@Override
	public Member getBookdtl(int memberId) {
		// TODO Auto-generated method stub
		return memberBookSearch.getBookdtl(memberId);
	}

	@Override
	public int updateBook(String idValue) {
		// TODO Auto-generated method stub
		String avail="No";
		return bookSearchDao.UpdateAvialiableBook(idValue,avail);
	}


	
}
