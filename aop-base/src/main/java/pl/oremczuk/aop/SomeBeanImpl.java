package pl.oremczuk.aop;

import java.util.logging.Logger;

public class SomeBeanImpl implements SomeBean {

	public void doSomething() {
		Logger.getLogger(this.getClass().getName()).info("I'm doing sth");

	}

}
