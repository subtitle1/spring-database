package com.sample.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.service.JobService;
import com.sample.vo.Job;


public class JobSelectAllApplication {

	public static void main(String[] args) {
		
		String resource = "classpath:/spring/context-jdbc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		JobService service = ctx.getBean(JobService.class);
		
		List<Job> jobList = service.getAllJobs();
		
		for (Job job : jobList) {
			System.out.println(job.getJobId());
		}
	}
}
