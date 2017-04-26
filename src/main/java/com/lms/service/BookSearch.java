package com.lms.service;

import com.lms.model.Books;
import com.lms.model.Member;

/**
 * @author nitrawat
 *
 */
public interface BookSearch {
	public Books getInputSearch(String id);
	public Books getInputSearchName(String name);
	public Member getBookdtl(int memberId);
	public int updateBook(String idValue);
	
	
	
}
