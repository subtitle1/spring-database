package com.sample.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.service.JobService;
import com.sample.vo.Job;

public class JobInsertApplication {

	public static void main(String[] args) {
		String resource = "classpath:/spring/context-jdbc.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		JobService service = ctx.getBean(JobService.class);
		
		Job job = new Job();
		job.setJobId("잉");
		job.setJobTitle("잉잉");
		job.setMinSalary(30000);
		job.setMaxSalary(60000);
		
		service.insertNewJob(job);
	}
}
