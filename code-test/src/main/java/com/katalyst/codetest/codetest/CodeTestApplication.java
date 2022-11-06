package com.katalyst.codetest.codetest;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeTestApplication implements CommandLineRunner  {

	private static Logger LOG = LoggerFactory
		      .getLogger(CodeTestApplication.class);
	
	public static void main(String[] args) {
		LOG.info("STARTING THE APPLICATION");
		SpringApplication.run(CodeTestApplication.class, args);
		LOG.info("APPLICATION FINISHED");
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("EXECUTING : command line runner");	
	}

}
