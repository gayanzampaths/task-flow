package com.gs.tfs.rest;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * author: gayan
 * created: 2023-09-23
 **/
public class TaskFlowInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses()
    {
        // Web configs
        return new Class<?>[]{TaskFlowWebConfig.class};
    }

    @Override
    protected String[] getServletMappings()
    {
        // root URL mapping
        return new String[]{"/"};
    }
}
