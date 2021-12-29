package com.sample.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.sample.vo.Job;

public class JobDaoImpl implements JobDao {

	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public void insertJob(Job job) {
		String sql = "insert into jobs (job_id, job_title, min_salary, max_salary)"
				+ "values (?, ?, ?, ?)";
		template.update(sql, job.getJobId(), job.getJobTitle(), job.getMinSalary(), job.getMaxSalary());
	}
	
	@Override
	public void updateJob(Job job) {
		String sql = "update jobs "
				+ "set "
				+ "		min_salary = ?, "
				+ "		max_salary = ? "
				+ "where job_id = ?";
		
		template.update(sql, job.getMinSalary(), job.getMaxSalary(), job.getJobId());
	}
	
	@Override
	public List<Job> getAllJobs() {
		String sql = "select * from jobs";
		// 이런 식으로도 만들 수도 있음, 익명 객체
		return template.query(sql, new RowMapper<Job>() {
			@Override
			public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
				Job job = new Job();
				job.setJobId(rs.getString("job_id"));
				job.setJobTitle(rs.getString("job_title"));
				job.setMinSalary(rs.getInt("min_salary"));
				job.setMaxSalary(rs.getInt("max_salary"));
				
				return job;
			}
		});
	}
	
	@Override
	public Job getJobById(String jobId) {
		String sql = "select * from jobs where job_id = ?";
		// 위의 표현을 조금 더 간략하게 만들 수 있다
		return template.queryForObject(sql, (rs, rownum) -> {
			Job job = new Job();
			
			job.setJobId(rs.getString("job_id"));
			job.setJobTitle(rs.getString("job_title"));
			job.setMinSalary(rs.getInt("min_salary"));
			job.setMaxSalary(rs.getInt("max_salary"));
			
			return job;
		}, jobId);
	}
	
	@Override
	public List<Job> getJobsBySalary(int minSalary, int maxSalary) {
		String sql = "select * from jobs where min_salary >= ? and max_salary <= ?";
		return template.query(sql, (rs, rownum) -> {
			Job job = new Job();
			
			job.setJobId(rs.getString("job_id"));
			job.setJobTitle(rs.getString("job_title"));
			job.setMinSalary(rs.getInt("min_salary"));
			job.setMaxSalary(rs.getInt("max_salary"));
			
			return job;
		}, minSalary, maxSalary);
	}

}
