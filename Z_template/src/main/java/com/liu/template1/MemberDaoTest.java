package com.liu.template1;

import java.util.List;

public class MemberDaoTest {
	public static void main(String[] args) {
	MemberDao memberDao = new MemberDao(null);
	List<?> result = memberDao.selectAll();
	System.out.println(result);
	}
}