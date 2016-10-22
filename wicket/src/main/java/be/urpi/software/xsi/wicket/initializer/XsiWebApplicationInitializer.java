package be.urpi.software.xsi.wicket.initializer;

import be.urpi.software.xsi.wicket.XsiApplication;
import be.urpi.software.xsi.wicket.config.WicketConfiguration;
import org.apache.wicket.protocol.http.WicketFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * Created by daniel on 11/09/16.
 */
public class XsiWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
        root.register(WicketConfiguration.class);
       /* FilterRegistration.Dynamic springSecurityFilterChainReg = servletContext.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class);
        springSecurityFilterChainReg.addMappingForUrlPatterns(EnumSet.of(DispatcherType.ERROR, DispatcherType.REQUEST), false, "*//*");*/
        servletContext.addListener(new ContextLoaderListener(root));
        WicketFilter wicketFilter = new WicketFilter(new XsiApplication()) {
            @Override
            public void init(boolean isServlet, FilterConfig filterConfig) throws ServletException {
                setFilterPath("");
                super.init(isServlet, filterConfig);
            }
        };

        FilterRegistration.Dynamic wicketFilterReg = servletContext.addFilter("wicketFilter", wicketFilter);
        wicketFilterReg.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "*");
    }
}
