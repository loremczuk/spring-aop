package pl.oremczuk.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("pl.oremczuk.aop")
@EnableAspectJAutoProxy
public class AppConfirguration {

}
