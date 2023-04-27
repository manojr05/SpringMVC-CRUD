package helper;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherClass extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] a = { MyConfiguration.class };
		return a;
	}

	@Override
	protected String[] getServletMappings() {
		String[] a = { "/" };
		return a;
	}
}
