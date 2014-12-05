package example

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.ComponentScan

@ComponentScan
@EnableAutoConfiguration
@EnableBatchProcessing
public class Application
{
	public static void main(String[] args)
	{
        new SpringApplicationBuilder(Application.class, "appcontext.groovy").run(args)
	}
}