package com.liu.template1;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

public class MemberDao extends JdbcTemplate {
	public MemberDao(DataSource dataSource) {
		super(dataSource);
	}

	public List<?> selectAll() {
		String sql = "select * from t_member";
		return super.executeQuery(sql, new RowMapper<Member>() {
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {
				Member member = new Member();
//�ֶι��࣬ԭ��ģʽ
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}
		}, null);
	}
}