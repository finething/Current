package scanned.service;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class ScheduledTask {
	
	@Autowired
	private SimpleJobLauncher repo;
	
	@Autowired
	private Job job;

	
	public SimpleJobLauncher getRepo() {
		return repo;
	}

	public void setRepo(SimpleJobLauncher repo) {
		this.repo = repo;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void run(){
		JobExecution execution=null;
		
		JobParameters param = new JobParametersBuilder().addLong("Time", System.currentTimeMillis()).toJobParameters();
		
		try {
			execution = repo.run(job, param);
		} catch (Exception e) {
			System.out.println(e.getMessage());			
		}	
	}

}
