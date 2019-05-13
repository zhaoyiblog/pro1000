package manger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import java.io.File;
import java.io.IOError;
import java.io.IOException;

/**
 * 项目由此类启动，此类继承AbstractAnnotationConfigDispatcherServletInitializer，Spring自动启动此类
 */
public class MangerWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("数据库配置完成！！");
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("servlet配置完成！！");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {

        return new String[]{"/"};
    }

    /**
     * 设置mutiparttresolver的一些属性设置
     * mutiparttresolver由servlet初始化
     *AbstractAnnotationConfigDispatcherServletInitializer在此处配置
     * @param registration
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
     registration.setMultipartConfig(new MultipartConfigElement(
                "C:/temp/", 2097152, 4194304, 0
        ));
    }

}
