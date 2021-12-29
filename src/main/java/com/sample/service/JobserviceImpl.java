package com.sample.service;

import java.util.List;

import com.sample.dao.JobDao;
import com.sample.vo.Job;

public class JobserviceImpl implements JobService {

	JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public void insertNewJob(Job job) {
		Job savedJob = jobDao.getJobById(job.getJobId());
		if (savedJob != null) {
			throw new RuntimeException("동일한 직종아이디가 이미 등록되어 있습니다.");
		} 
		if (job.getMaxSalary() <= job.getMinSalary()) {
			throw new RuntimeException("최소 급여는 최대 급여보다 작거나 같을 수 없습니다.");
		}
		jobDao.insertJob(job);
	}
	
	@Override
	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}
	
	@Override
	public List<Job> getJobsBySalary(int minSalary, int maxSalary) {
		return jobDao.getJobsBySalary(minSalary, maxSalary);
	}
	
	@Override
	public Job getJobDetail(String jobId) {
		return jobDao.getJobById(jobId);
	}
}
