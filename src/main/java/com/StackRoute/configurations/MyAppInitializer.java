package com.StackRoute.configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//    Inbuilt Abstract Class of Dispatcher servelet which acts as a way for request and response
//    from browser to Applicaton or Resource
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MyAppConfigurationClass.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
//    Mapping of URL with respect to /
}
